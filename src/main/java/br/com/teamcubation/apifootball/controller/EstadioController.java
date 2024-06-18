package br.com.teamcubation.apifootball.controller;

import br.com.teamcubation.apifootball.model.Estadio;
import br.com.teamcubation.apifootball.service.EstadioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estadios")
@Validated
public class EstadioController {

    private final EstadioService estadioService;

    @Autowired
    public EstadioController(EstadioService estadioService) {
        this.estadioService = estadioService;
    }

    @PostMapping
    public ResponseEntity<Estadio> createEstadio(@Valid @RequestBody Estadio estadio) {
        try {
            Estadio savedEstadio = estadioService.save(estadio);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedEstadio);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Estadio>> getEstadioById(@PathVariable Long id) {
        Optional<Estadio> estadio = estadioService.getEstadioById(id);
        return ResponseEntity.ok(estadio);
    }

    @GetMapping
    public ResponseEntity<List<Estadio>> getAllEstadios() {
        try {
            List<Estadio> estadios = estadioService.findAll();
            return ResponseEntity.ok(estadios);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstadio(@PathVariable Long id) {
        try {
            estadioService.delete(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estadio> updateEstadio(@PathVariable Long id, @RequestBody Estadio estadioDetails) {
        Estadio updatedEstadio = estadioService.updateEstadio(id, estadioDetails);
        return ResponseEntity.ok(updatedEstadio); }
}
