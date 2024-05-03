package List.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> inteiros;

    public OrdenacaoNumeros() {
        inteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        inteiros.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(inteiros);
    }

    public void ordenarDescendente() {
        Collections.sort(inteiros, Collections.reverseOrder());
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(1);

        System.out.println("Lista de números: " + ordenacaoNumeros.inteiros);

        ordenacaoNumeros.ordenarAscendente();
        System.out.println("Lista de números ordenados de forma ascendente: " + ordenacaoNumeros.inteiros);

        ordenacaoNumeros.ordenarDescendente();
        System.out.println("Lista de números ordenados de forma descendente: " + ordenacaoNumeros.inteiros);
    }
}
