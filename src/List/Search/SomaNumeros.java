package List.Search;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> inteiros;

    public SomaNumeros() {
        this.inteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        inteiros.add(numero);
    }

    public int calcularSoma() {
        int resultado = 0;
        if (!inteiros.isEmpty()) {
            for (Integer integer : inteiros) {
                resultado += integer;
            }
        }
        return resultado;
    }

    public int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;
        if (!inteiros.isEmpty()) {
            for (Integer integer : inteiros) {
                if (integer > maior) {
                    maior = integer;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;
        if (!inteiros.isEmpty()) {
            for (Integer integer : inteiros) {
                if (integer < menor) {
                    menor = integer;
                }
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros() {
        return inteiros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(50);
        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Números: " + somaNumeros.exibirNumeros());
    }
}
