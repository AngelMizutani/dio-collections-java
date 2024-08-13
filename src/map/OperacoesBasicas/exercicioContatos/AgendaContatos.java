package map.OperacoesBasicas.exercicioContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda está vazia!");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome); //case sensitive
        } else {
            System.out.println("A agenda está vazia!");
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Zelda", 123456);
        agendaContatos.adicionarContato("Fiona", 456789);
        agendaContatos.adicionarContato("Miyuki", 789123);
        agendaContatos.adicionarContato("Tomoko", 987654);
        agendaContatos.adicionarContato("Frangolino Filho", 654321);
        agendaContatos.adicionarContato("Juninho", 321987);
        agendaContatos.adicionarContato("Juninho", 159753);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Tomoko");
        agendaContatos.exibirContatos();

        System.out.println("O numero procurado é " + agendaContatos.pesquisarPorNome("Frangolino"));
        System.out.println("O numero procurado é " + agendaContatos.pesquisarPorNome("Fiona"));
        System.out.println("O numero procurado é " + agendaContatos.pesquisarPorNome("Tomoko"));
        System.out.println("O numero procurado é " + agendaContatos.pesquisarPorNome("zelda"));
    }
}
