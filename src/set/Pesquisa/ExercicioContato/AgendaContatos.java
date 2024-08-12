package set.Pesquisa.ExercicioContato;

import set.OperacoesBasicas.ConjuntoConvidados.Convidado;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) { //ignore case?
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Zelda", 123);
        agenda.adicionarContato("Fiona Mizutani", 456);
        agenda.adicionarContato("Miyuki", 789);
        agenda.adicionarContato("Juninho", 159);
        agenda.adicionarContato("Frangolino", 357);
        agenda.adicionarContato("Miyuki", 357);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Fiona"));

        System.out.println(agenda.atualizarNumeroContato("Frangolino", 105));
    }
}
