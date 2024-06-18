package br.com.teamcubation.apifootball.service;

import br.com.teamcubation.apifootball.model.Partida;
import br.com.teamcubation.apifootball.model.Clube;
import br.com.teamcubation.apifootball.model.Estadio;
import br.com.teamcubation.apifootball.repository.ClubeRepository;
import br.com.teamcubation.apifootball.repository.EstadioRepository;
import br.com.teamcubation.apifootball.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

@Service
public class PartidaService {

    private final PartidaRepository partidaRepository;
    private final ClubeRepository clubeRepository;
    private final EstadioRepository estadioRepository;

    @Autowired
    public PartidaService(
            PartidaRepository partidaRepository,
            ClubeRepository clubeRepository,
            EstadioRepository estadioRepository) {
        this.partidaRepository = partidaRepository;
        this.clubeRepository = clubeRepository;
        this.estadioRepository = estadioRepository;
    }

    public Partida save(Partida partida) {
        Optional<Clube> clubeMandante = clubeRepository.findById(partida.getClubeMandante().getId());
        Optional<Clube> clubeVisitante = clubeRepository.findById(partida.getClubeVisitante().getId());
        if (!clubeMandante.isPresent() || !clubeVisitante.isPresent()) {
            throw new IllegalArgumentException();
        }

        if (!clubeMandante.get().isAtivo() || !clubeVisitante.get().isAtivo()) {
            throw new IllegalArgumentException();
        }

        Optional<Estadio> estadio = estadioRepository.findById(partida.getEstadio().getId());
        if (!estadio.isPresent()) {
            throw new IllegalArgumentException();
        }

        partidaRepository.existsByEstadioIdAndDataHoraBetween(
                partida.getEstadio().getId(),
                partida.getDataHora().toLocalDate().atStartOfDay(),
                partida.getDataHora().toLocalDate().plusDays(1).atStartOfDay());

        partida.setClubeMandante(clubeMandante.get());
        partida.setClubeVisitante(clubeVisitante.get());
        partida.setEstadio(estadio.get());

        String[] gols = partida.getResultado().split("-");
        if (gols.length == 2) {
            try {
                partida.setGolsMandante(Integer.parseInt(gols[0].trim()));
                partida.setGolsVisitante(Integer.parseInt(gols[1].trim()));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }

        return partidaRepository.save(partida);
    }

    public Partida update(Long id, Partida partida) {
        partida.setId(id);
        return partidaRepository.save(partida);
    }

    public void delete(Long id) {
        partidaRepository.deleteById(id);
    }

    public Optional<Partida> findById(Long id) {
        return partidaRepository.findById(id);
    }

    public Iterable<Partida> findAll() {
        return partidaRepository.findAll();
    }
}
