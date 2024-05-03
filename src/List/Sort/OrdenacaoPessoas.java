package List.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoPessoas {
    private List<Pessoa> grupo;

    public OrdenacaoPessoas() {
        grupo = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        grupo.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade() {
        Collections.sort(grupo);
    }

    public void ordenarPorAltura() {
        Collections.sort(grupo, new CompararAltura());
    }

    public static void main(String[] args) {
        OrdenacaoPessoas op = new OrdenacaoPessoas();
        op.adicionarPessoa("João", 20, 1.80);
        op.adicionarPessoa("Maria", 25, 1.70);
        op.adicionarPessoa("José", 30, 1.75);
        op.adicionarPessoa("Ana", 22, 1.65);

        System.out.println("Ordenação por idade:");
        op.ordenarPorIdade();
        for (Pessoa p : op.grupo) {
            System.out.println(p);
        }

        System.out.println("\nOrdenação por altura:");
        op.ordenarPorAltura();
        for (Pessoa p : op.grupo) {
            System.out.println(p);
        }
    }
}
