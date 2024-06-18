package br.com.teamcubation.apifootball.controller;
import br.com.teamcubation.apifootball.model.Partida;
import br.com.teamcubation.apifootball.service.PartidaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/partidas")
@Validated
public class PartidaController {

    private final PartidaService partidaService;

    @Autowired
    public PartidaController(PartidaService partidaService) {
        this.partidaService = partidaService;
    }

    @PostMapping
    public ResponseEntity<Partida> createPartida(@Valid @RequestBody Partida partida) {
        try {
            Partida savedPartida = partidaService.save(partida);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedPartida);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        } catch (IllegalStateException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
        } catch (Exception e) {
            e.printStackTrace(); // Adiciona detalhes do erro no log
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Partida> updatePartida(@PathVariable Long id, @Valid @RequestBody Partida partida) {
        try {
            Partida updatedPartida = partidaService.update(id, partida);
            return ResponseEntity.ok(updatedPartida);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePartida(@PathVariable Long id) {
        try {
            partidaService.delete(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace(); // Adiciona detalhes do erro no log
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Partida> getPartidaById(@PathVariable Long id) {
        Optional<Partida> partida = partidaService.findById(id);
        return partida.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping
    public ResponseEntity<List<Partida>> getAllPartidas() {
        List<Partida> partidas = (List<Partida>) partidaService.findAll();
        return ResponseEntity.ok(partidas);
    }
}
