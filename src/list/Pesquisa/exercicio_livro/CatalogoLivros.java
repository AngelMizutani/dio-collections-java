package list.Pesquisa.exercicio_livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) return l;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1955);
        catalogoLivros.adicionarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1991);
        catalogoLivros.adicionarLivro("Harry Potter e o Prisioneiro de Askaban", "J.K. Rowling", 2002);
        catalogoLivros.adicionarLivro("Anne de Green Gables", "L.M. Montgomery", 1907);
        catalogoLivros.adicionarLivro("Anne de Green Gables", "L.M. Montgomery", 1907);
        catalogoLivros.adicionarLivro("Anne de Avonlea", "L.M. Montgomery", 1908);

//        System.out.println("Livros de Tolkien: " + catalogoLivros.pesquisarPorAutor("j.r.r. tolkien"));
//        System.out.println("Livros de Harry Potter: " + catalogoLivros.pesquisarPorAutor("j.k. rowling"));
//        System.out.println("Livros da Anne: " + catalogoLivros.pesquisarPorAutor("L.M. Montgomery"));

//        System.out.println("Livros publicados entre 1950 e 2000: " + catalogoLivros.pesquisaPorIntervaloAnos(1950, 2000));
//        System.out.println("Livros publicados entre 1900 e 2000: " + catalogoLivros.pesquisaPorIntervaloAnos(1900, 2000));

        System.out.println("Livro da anne: " + catalogoLivros.pesquisarPorTitulo("Anne de Green Gables"));
    }
}


