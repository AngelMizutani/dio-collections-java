package map.Pesquisa.exercicioPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {
    private Map<String, Integer> contagemPalavraMap;

    public ContagemPalavra() {
        this.contagemPalavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavraMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavraMap.isEmpty()) {
            contagemPalavraMap.remove(palavra);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavraMap);
    }

    public String encontrarPalavraMaisFrequente() {
        int cont = 0;
        String palavraMaisFrequente = null;

        if (!contagemPalavraMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemPalavraMap.entrySet()) {
                if (entry.getValue() > cont) {
                    cont = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavra contagemPalavra = new ContagemPalavra();

        contagemPalavra.adicionarPalavra("gato", 2);
        contagemPalavra.adicionarPalavra("casa", 10);
        contagemPalavra.adicionarPalavra("muro", 5);
        contagemPalavra.adicionarPalavra("geladeira", 1);
        contagemPalavra.adicionarPalavra("roça", 3);

        contagemPalavra.exibirContagemPalavras();

        contagemPalavra.removerPalavra("geladeira");
        contagemPalavra.exibirContagemPalavras();

        System.out.println("A palavra mais frequente é " + contagemPalavra.encontrarPalavraMaisFrequente());

    }
}
