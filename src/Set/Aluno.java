package Set;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private long matricula;
    private double media;

    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareToIgnoreCase(aluno.getNome());
    }

    @Override
    public String toString() {
        return "Aluno: " +
                "nome = '" + nome + '\'' +
                ", matricula = " + matricula +
                ", media = " + media;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Aluno))
            return false;
        Aluno aluno = (Aluno) obj;
        return matricula == aluno.matricula;
    }

}

class comparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}
