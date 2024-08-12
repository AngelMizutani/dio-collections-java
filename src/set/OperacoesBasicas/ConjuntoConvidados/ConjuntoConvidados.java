package set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados no total.");

        conjuntoConvidados.adicionarConvidado("Zelda", 123);
        conjuntoConvidados.adicionarConvidado("Fiona", 456);
        conjuntoConvidados.adicionarConvidado("Miyuki", 789);
        conjuntoConvidados.adicionarConvidado("Juninho", 159);
        conjuntoConvidados.adicionarConvidado("Frangolino", 357);

        //este convidado não pode ser inserido, pois o codigo de convite é unico
        conjuntoConvidados.adicionarConvidado("Branquinho", 123);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados no total.");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(789);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados no total.");
        conjuntoConvidados.exibirConvidados();
    }
}
