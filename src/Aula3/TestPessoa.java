package Aula3;

public class TestPessoa {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa("Fulano", 30, 1.80);
        System.out.println("Pessoa: " + fulano.getNome() + ", idade: " + fulano.getIdade() + ", altura: " + fulano.getAltura());

        Pessoa ciclano = new Pessoa();
        ciclano.setNome("Ciclano");
        ciclano.setIdade(25);
        ciclano.setAltura(1.70);
        System.out.println("Pessoa: " + ciclano.getNome() + ", idade: " + ciclano.getIdade() + ", altura: " + ciclano.getAltura());

        Aluno a = new Aluno("João", 20, 1.75, "2023001");
        System.out.println("Aluno: " + a.getNome() + ", idade: " + a.getIdade() + ", altura: " + a.getAltura() + ", matrícula: " + a.getMatricula());

        Professor p = new Professor("Maria", 40, 1.65, 3500.50, "Matemática");
        System.out.println("Professor: " + p.getNome() + ", idade: " + p.getIdade() + ", altura: " + p.getAltura() + ", salário: " + p.getSalario() + ", disciplina: " + p.getDisciplina());
        p.aumentarSalario(500.00);
        System.out.println("Salario do professor após aumento: " + p.getSalario());
    }
}

