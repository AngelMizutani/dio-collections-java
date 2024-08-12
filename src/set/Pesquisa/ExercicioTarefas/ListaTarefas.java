package set.Pesquisa.ExercicioTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemovida = null;

        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemovida = t;
                break;
            }
        }

        tarefaSet.remove(tarefaRemovida);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaConcluida = null;

        for (Tarefa f : tarefaSet) {
            if (f.getDescricao().equalsIgnoreCase(descricao)) {
                f.setConcluida(true);
                tarefaConcluida = f;
                break;
            }
        }
        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;

        for (Tarefa f : tarefaSet) {
            if (f.getDescricao().equalsIgnoreCase(descricao)) {
                f.setConcluida(false);
                tarefaPendente = f;
                break;
            }
        }
        return tarefaPendente;
    }

    public void limparListaTarefas() {
        tarefaSet.removeAll(tarefaSet);
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Comprar leite");
        listaTarefas.adicionarTarefa("Limpar a casa");
        listaTarefas.adicionarTarefa("Lavar a louça");
        listaTarefas.adicionarTarefa("Comprar banana");
        listaTarefas.adicionarTarefa("Comprar carne");

        System.out.println("Temos " + listaTarefas.contarTarefas() + " tarefas cadastradas");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

//        listaTarefas.marcarTarefaConcluida("Comprar leite");
//        listaTarefas.marcarTarefaConcluida("Comprar banana");
//        System.out.println("Tarefas concluidas:\n" + listaTarefas.obterTarefasConcluidas() + "\n");
//
//        System.out.println("Tarefas pendentes:\n" + listaTarefas.obterTarefasPendentes() + "\n");
//
//        listaTarefas.marcarTarefaPendente("Comprar leite");
//        System.out.println("Tarefas pendentes:\n" + listaTarefas.obterTarefasPendentes() + "\n");

//        listaTarefas.removerTarefa("limpar a casa");
//        System.out.println("Temos " + listaTarefas.contarTarefas() + " tarefas cadastradas");
//        listaTarefas.exibirTarefas();

    }
}
