import java.text.SimpleDateFormat;
import java.util.Date;

class Pessoa {
    String nome;
    String CPF;
    Date dataNascimento;

    Pessoa(String nome, String CPF, Date dataNascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    void exibirDetalhes() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Data de Nascimento: " + sdf.format(dataNascimento));
    }
}

class Aluno extends Pessoa {
    String RA;
    String curso;

    Aluno(String nome, String CPF, Date dataNascimento, String RA, String curso) {
        super(nome, CPF, dataNascimento);
        this.RA = RA;
        this.curso = curso;
    }

    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("RA: " + RA);
        System.out.println("Curso: " + curso);
    }
}

class Professor extends Pessoa {
    String disciplina;
    String RF;

    Professor(String nome, String CPF, Date dataNascimento, String disciplina, String RF) {
        super(nome, CPF, dataNascimento);
        this.disciplina = disciplina;
        this.RF = RF;
    }

    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("RF: " + RF);
    }
}

class Funcionario extends Pessoa {
    String cargo;
    String RGM;

    Funcionario(String nome, String CPF, Date dataNascimento, String cargo, String RGM) {
        super(nome, CPF, dataNascimento);
        this.cargo = cargo;
        this.RGM = RGM;
    }

    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cargo: " + cargo);
        System.out.println("RGM: " + RGM);
    }
}

public class Main {
    public static void main(String[] args) {
        Date dataPessoa = new Date(90, 5, 15);  // 15/06/1990
        Date dataAluno = new Date(100, 7, 25);  // 25/08/2000
        Date dataProfessor = new Date(80, 1, 10); // 10/02/1980
        Date dataFuncionario = new Date(95, 11, 5); // 05/12/1995

        Pessoa pessoa = new Pessoa("João da Silva", "123.456.789-00", dataPessoa);
        Aluno aluno = new Aluno("Maria dos Santos", "987.654.321-00", dataAluno, "A12345", "Análise e Desenvolvimento de Sistemas");
        Professor professor = new Professor("Carlos Pereira", "111.222.333-00", dataProfessor, "Matemática", "RF123");
        Funcionario funcionario = new Funcionario("Ana Oliveira", "555.666.777-00", dataFuncionario, "Secretária", "RGM99");

        System.out.println("=== Detalhes da Pessoa ===");
        pessoa.exibirDetalhes();

        System.out.println("\n=== Detalhes da Aluna ===");
        aluno.exibirDetalhes();

        System.out.println("\n=== Detalhes do Professor ===");
        professor.exibirDetalhes();

        System.out.println("\n=== Detalhes da Funcionária ===");
        funcionario.exibirDetalhes();
    }
}