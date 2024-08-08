package list.OperacoesBasicas.exercicio_carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item item : carrinhoCompras) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        carrinhoCompras.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0.0;

        for (Item item : carrinhoCompras) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(carrinhoCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Mouse", 50.00, 2);
        carrinhoDeCompras.adicionarItem("Monitor", 500.00, 1);
        carrinhoDeCompras.adicionarItem("Monitor", 500.00, 1);
        carrinhoDeCompras.adicionarItem("Teclado", 70.00, 2);

        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra é " + carrinhoDeCompras.calcularValorTotal()); //1240

        carrinhoDeCompras.removerItem("monitor");

        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra é " + carrinhoDeCompras.calcularValorTotal()); //240
    }
}


