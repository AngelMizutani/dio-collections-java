package list.Pesquisa.exercicio_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!listaNumeros.isEmpty()) {
            for (int num : listaNumeros) {
                soma += num;
            }
        }

        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = -9999999;
        if(!listaNumeros.isEmpty()) {
            maiorNumero = listaNumeros.get(0);
            for (int num : listaNumeros) {
                if (num > maiorNumero) {
                    maiorNumero = num;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = 999999999;
        if(!listaNumeros.isEmpty()) {
            menorNumero = listaNumeros.get(0);
            for (int num : listaNumeros) {
                if (num < menorNumero) {
                    menorNumero = num;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros lista = new SomaNumeros();

        lista.adicionarNumero(3);
        lista.adicionarNumero(5);
        lista.adicionarNumero(2);
        lista.adicionarNumero(-1);
        lista.adicionarNumero(4);

        lista.exibirNumeros();

        System.out.println("A soma dos números é: " + lista.calcularSoma()); //13
        System.out.println("O maior número é : " + lista.encontrarMaiorNumero()); //5
        System.out.println("O menor número é : " + lista.encontrarMenorNumero()); //-1
    }
}
