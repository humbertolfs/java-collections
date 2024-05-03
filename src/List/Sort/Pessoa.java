package List.Sort;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private Integer idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public int compareTo(Pessoa pessoa) {
        return idade.compareTo(pessoa.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa: " +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura;
    }
}

class CompararAltura implements Comparator<Pessoa> {
    public int compare(Pessoa p1, Pessoa p2) {
        if (p1.getAltura() > p2.getAltura()) {
            return 1;
        } else if (p1.getAltura() < p2.getAltura()) {
            return -1;
        } else {
            return 0;
        }
    }
}
