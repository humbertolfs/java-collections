package Set;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoRemover = null;
        if (!alunos.isEmpty()) {
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula() == matricula) {
                    alunoRemover = aluno;
                    break;
                }
            }
        }
        if (alunoRemover != null) {
            alunos.remove(alunoRemover);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> listaPorNome = new TreeSet<>(alunos);
        System.out.println("Alunos ordenados por nome: " + listaPorNome);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> listaPorNota = new TreeSet<>(new comparatorPorNota());
        listaPorNota.addAll(alunos);
        System.out.println("Alunos ordenados por nota: " + listaPorNota);
    }

    public void exibirAlunos() {
        System.out.println("Alunos: " + alunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.adicionarAluno("João", 123, 8.5);
        gerenciador.adicionarAluno("Maria", 456, 9.0);
        gerenciador.adicionarAluno("José", 789, 7.5);
        gerenciador.adicionarAluno("Ana", 101, 9.5);
        gerenciador.exibirAlunos();
        gerenciador.exibirAlunosPorNome();
        gerenciador.exibirAlunosPorNota();
        gerenciador.removerAluno(456);
        gerenciador.exibirAlunos();
    }
}
