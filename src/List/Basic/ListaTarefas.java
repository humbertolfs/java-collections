package List.Basic;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        tarefas.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        if (!tarefas.isEmpty()) {
            List<Tarefa> removeList = new ArrayList<>();
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    removeList.add(tarefa);
                }
            }
            tarefas.removeAll(removeList);
        } else {
            System.out.println("Lista de tarefas vazia.");
        }
    }

    public void obterNumeroTotalTarefas() {
        System.out.println("Total de tarefas: " + tarefas.size());
    }

    public void obterDescricoesTarefas() {
        if (!tarefas.isEmpty()) {
            System.out.println(tarefas);
        } else {
            System.out.println("Lista de tarefas vazia.");
        }
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Estudar Python");
        lista.adicionarTarefa("Estudar JavaScript");
        lista.adicionarTarefa("Estudar C++");

        lista.obterNumeroTotalTarefas();
        lista.obterDescricoesTarefas();

        lista.removerTarefa("Estudar Python");

        lista.obterNumeroTotalTarefas();
        lista.obterDescricoesTarefas();
    }
}
