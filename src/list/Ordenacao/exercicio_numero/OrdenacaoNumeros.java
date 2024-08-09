package list.Ordenacao.exercicio_numero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaAscendente = new ArrayList<>(listaNumeros);
        Collections.sort(listaAscendente);
        return listaAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaDescendente = new ArrayList<>(listaNumeros);
        listaDescendente.sort(Collections.reverseOrder());
        return listaDescendente;
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "listaNumeros=" + listaNumeros +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(1);

        System.out.println(ordenacaoNumeros);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
