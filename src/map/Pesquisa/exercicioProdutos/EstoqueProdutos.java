package map.Pesquisa.exercicioProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0.0;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }

        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorValor = null;
        double maiorValor = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() * p.getQuantidade() > maiorValor) {
                    produtoMaiorValor = p;
                    maiorValor = p.getPreco() * p.getQuantidade();
                }
            }
        }
        return produtoMaiorValor;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "produto 1", 2, 10.0);
        estoqueProdutos.adicionarProduto(2L, "produto 2", 1, 100.0);
        estoqueProdutos.adicionarProduto(3L, "produto 3", 5, 30.0);
        estoqueProdutos.adicionarProduto(4L, "produto 4", 3, 12.0);
        estoqueProdutos.adicionarProduto(5L, "produto 5", 4, 5.0);

        estoqueProdutos.exibirProdutos();

        //System.out.println("O valor total do estoque é " + estoqueProdutos.calcularValorTotalEstoque()); //326
        System.out.println("O produto mais caro é " + estoqueProdutos.obterProdutoMaisCaro()); //produto2
        System.out.println("O produto mais barato é " + estoqueProdutos.obterProdutoMaisBarato()); //produto 5
        System.out.println("O produto com maior valor é " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque()); //produto 3
    }
}
