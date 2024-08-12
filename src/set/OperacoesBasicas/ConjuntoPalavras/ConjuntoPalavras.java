package set.OperacoesBasicas.ConjuntoPalavras;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavras {
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavras() {
        this.conjuntoPalavras = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavras that = (ConjuntoPalavras) o;
        return Objects.equals(conjuntoPalavras, that.conjuntoPalavras);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(conjuntoPalavras);
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraRemovida = null;
        for (String p : conjuntoPalavras) {
            if (p.equalsIgnoreCase(palavra)) {
                palavraRemovida = p;
                break;
            }
        }
        conjuntoPalavras.remove(palavraRemovida);
    }

     public void verificarPalavra(String palavra) {
        int cont = 0;
        for (String p : conjuntoPalavras) {
            if (p.equalsIgnoreCase(palavra)) {
                cont++;
            }
        }

         System.out.println(cont > 0 ?
                 "A palavra " + palavra + " está presente no conjunto" :
                 "A palavra " + palavra + " não está presente no conjunto");
     }

     public void exibirPalavrasUnicas() {
         System.out.println(conjuntoPalavras);
     }

    public static void main(String[] args) {
        ConjuntoPalavras conjunto = new ConjuntoPalavras();

        conjunto.adicionarPalavra("boneca");
        conjunto.adicionarPalavra("bola");
        conjunto.adicionarPalavra("bola");
        conjunto.adicionarPalavra("pipa");
        conjunto.adicionarPalavra("peteca");
        conjunto.adicionarPalavra("chaleira");
        conjunto.adicionarPalavra("panela");
        conjunto.exibirPalavrasUnicas();

        conjunto.removerPalavra("pipa");
        conjunto.exibirPalavrasUnicas();

        conjunto.verificarPalavra("boneca");
        conjunto.verificarPalavra("soldado");
    }
}
