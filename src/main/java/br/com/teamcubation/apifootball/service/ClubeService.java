package br.com.teamcubation.apifootball.service;

import br.com.teamcubation.apifootball.model.Clube;
import br.com.teamcubation.apifootball.model.Estado;
import br.com.teamcubation.apifootball.repository.ClubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ClubeService {

    private final ClubeRepository clubeRepository;

    @Autowired
    public ClubeService(ClubeRepository clubeRepository) {
        this.clubeRepository = clubeRepository;
    }

    public Clube save(Clube clube) {
        if (!Estado.isValid(clube.getEstado())) {
            throw new IllegalArgumentException( clube.getEstado());
        }
        Optional<Clube> existingClube = clubeRepository.findByNomeAndEstado(clube.getNome(), clube.getEstado());
        if (existingClube.isPresent()) {
            throw new IllegalStateException();
        }
        return clubeRepository.save(clube);
    }

    public Clube update(Long id, Clube clube) {
        if (!Estado.isValid(clube.getEstado())) {
            throw new IllegalArgumentException(clube.getEstado());
        }
        if (clube.getDataCriacao() != null && clube.getDataCriacao().isAfter(LocalDate.now())) {
            throw new IllegalArgumentException();
        }

        Optional<Clube> existingClube = clubeRepository.findById(id);
        if (!existingClube.isPresent()) {
            throw new IllegalStateException();
        }

        Optional<Clube> conflictingClube = clubeRepository.findByNomeAndEstado(clube.getNome(), clube.getEstado());
        if (conflictingClube.isPresent() && !conflictingClube.get().getId().equals(id)) {
            throw new IllegalStateException();
        }

        Clube clubeToUpdate = existingClube.get();


        clubeToUpdate.setNome(clube.getNome());
        clubeToUpdate.setEstado(clube.getEstado());
        clubeToUpdate.setDataCriacao(clube.getDataCriacao());
        clubeToUpdate.setAtivo(clube.isAtivo());

        return clubeRepository.save(clubeToUpdate);
    }

    public void inactivate(Long id) {
        Optional<Clube> existingClube = clubeRepository.findById(id);
        if (!existingClube.isPresent()) {
            throw new IllegalStateException();
        }
        Clube clube = existingClube.get();
        clube.setAtivo(false);
        clubeRepository.save(clube);
    }

    public Optional<Clube> findById(Long id) {
        return clubeRepository.findById(id);
    }

    public List<Clube> findAll() {
        return clubeRepository.findAll();
    }

}
