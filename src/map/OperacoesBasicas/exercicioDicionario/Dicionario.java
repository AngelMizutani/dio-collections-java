package map.OperacoesBasicas.exercicioDicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);

    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Dicionário vazio!");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("Dicionário vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = null;
        if (!dicionarioMap.isEmpty()) {
            definicao = dicionarioMap.get(palavra);
        } else {
            System.out.println("Dicionário vazio!");
        }

        return definicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("palavra1", "definicao1");
        dicionario.adicionarPalavra("palavra2", "definicao2");
        dicionario.adicionarPalavra("palavra3", "definicao3");
        dicionario.adicionarPalavra("palavra4", "definicao4");
        dicionario.adicionarPalavra("palavra4", "definicao5"); //sobrescreve

        dicionario.exibirPalavras();

        dicionario.removerPalavra("palavra1");
        dicionario.exibirPalavras();

        System.out.println("A definição da palavra procurada é " + dicionario.pesquisarPorPalavra("palavra2"));
        System.out.println("A definição da palavra procurada é " + dicionario.pesquisarPorPalavra("palavra1"));

    }
}
