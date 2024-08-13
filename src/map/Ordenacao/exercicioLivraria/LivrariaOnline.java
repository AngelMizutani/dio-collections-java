package map.Ordenacao.exercicioLivraria;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrariaMap;

    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrariaMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();
        if (!livrariaMap.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    chavesRemover.add(entry.getKey());
                }
            }
        }
        for (String key : chavesRemover) {
            livrariaMap.remove(key);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPreco = new ArrayList<>(livrariaMap.entrySet());
        Collections.sort(livrosParaOrdenarPreco, new ComparatorPorPreco());
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPreco;
    }

    public void pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new HashMap<>();
        if (!livrariaMap.isEmpty()) {
            for(Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
                if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.put(entry.getKey(), entry.getValue());
                }
            }
        }
        System.out.println(livrosPorAutor);
    }

    public Livro obterLivroMaisCaro() {
        double maiorPreco = 0d;
        Livro livroMaisCaro = null;

        if (!livrariaMap.isEmpty()) {
            for(Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
                if (entry.getValue().getPreco() > maiorPreco) {
                    maiorPreco = entry.getValue().getPreco();
                    livroMaisCaro = entry.getValue();
                }
            }
        }
        return  livroMaisCaro;
    }

    public Livro obterLivroMaisBarato() {
        double menorPreco = Double.MAX_VALUE;
        Livro livroMaisBarato = null;

        if (!livrariaMap.isEmpty()) {
            for(Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
                if (entry.getValue().getPreco() < menorPreco) {
                    menorPreco = entry.getValue().getPreco();
                    livroMaisBarato = entry.getValue();
                }
            }
        }
        return  livroMaisBarato;
    }

    public void exibirLivros() {
        System.out.println(livrariaMap);
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("www.1", "Titulo1", "Autor1", 10.0);
        livrariaOnline.adicionarLivro("www.2", "Titulo1", "Autor1", 20.0);
        livrariaOnline.adicionarLivro("www.3", "Titulo2", "Autor1", 30.0);
        livrariaOnline.adicionarLivro("www.4", "Titulo3", "Autor2", 40.0);

        livrariaOnline.exibirLivros();

        System.out.println("O livro mais caro é " + livrariaOnline.obterLivroMaisCaro());
        System.out.println("O livro mais barato é " + livrariaOnline.obterLivroMaisBarato());

//        livrariaOnline.pesquisarLivrosPorAutor("Autor1");

//        livrariaOnline.removerLivro("Titulo1");
//        livrariaOnline.exibirLivros();
    }
}
