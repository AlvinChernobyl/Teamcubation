package br.com.teamcubation.exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Checklist {
    private List<Tarefa> tarefas;

    public Checklist() {
        this.tarefas = new ArrayList<>();
    }

    public void addTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public List<Tarefa> getTodasAsTarefas() {
        return tarefas;
    }

    public List<Tarefa> getTodasAsTarefasConcluidas() {
        return tarefas.stream()
                .filter(Tarefa::isConcluida)
                .collect(Collectors.toList());
    }

    public List<Tarefa> getTodasAsTarefasPendentes() {
        return tarefas.stream()
                .filter(tarefa -> !tarefa.isConcluida())
                .collect(Collectors.toList());
    }

    public void alterarStatusTarefa(int id, boolean concluida) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.setConcluida(concluida);
                return;
            }
        }
        throw new IllegalArgumentException("Tarefa com ID " + id + " não encontrada.");
    }

    public List<String> getTodasAsDescricoes() {
        return tarefas.stream()
                .map(Tarefa::getDescricao)
                .collect(Collectors.toList());
    }

    public List<Tarefa> getTodasAsTarefasOrdenadasPorConclusao() {
        return tarefas.stream()
                .sorted(Comparator.comparing(Tarefa::isConcluida).reversed()
                        .thenComparing(Tarefa::getDescricao))
                .collect(Collectors.toList());
    }
}
