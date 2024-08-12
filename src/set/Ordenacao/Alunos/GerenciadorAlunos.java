package set.Ordenacao.Alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(Long matricula, String nome, double media) {
        alunoSet.add(new Aluno(matricula, nome, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;

        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }

        alunoSet.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno(1L, "Zelda", 9.5);
        gerenciadorAlunos.adicionarAluno(2L, "Fiona", 10.0);
        gerenciadorAlunos.adicionarAluno(2L, "Miyuki", 8.5);
        gerenciadorAlunos.adicionarAluno(4L, "Juninho", 8.0);
        gerenciadorAlunos.adicionarAluno(5L, "Frangolino", 7.0);

        gerenciadorAlunos.exibirAlunos();

//        gerenciadorAlunos.removerAluno(5L);
//        gerenciadorAlunos.exibirAlunos();

        System.out.println("Alunos por nome:\n" + gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("Alunos por nota:\n" + gerenciadorAlunos.exibirAlunosPorNota());
    }
}
