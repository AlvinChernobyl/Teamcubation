package br.com.teamcubation.apifootball.service;

import br.com.teamcubation.apifootball.model.Estadio;
import br.com.teamcubation.apifootball.repository.EstadioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadioService {

    private final EstadioRepository estadioRepository;

    @Autowired
    public EstadioService(EstadioRepository estadioRepository) {
        this.estadioRepository = estadioRepository;
    }
    public Estadio updateEstadio(Long id, Estadio estadioDetails) {
        return estadioRepository.save(estadioDetails);
    }

    public Optional<Estadio> getEstadioById(Long id) {
        return estadioRepository.findById(id);
    }

    public Estadio save(Estadio estadio) {
        return estadioRepository.save(estadio);
    }

    public Optional<Estadio> findById(Long id) {
        return estadioRepository.findById(id);
    }

    public List<Estadio> findAll() {
        return estadioRepository.findAll();
    }

    public void delete(Long id) {
        estadioRepository.deleteById(id);
    }
}
