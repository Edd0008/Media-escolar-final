package br.com.jandira.senai.mediaescolar;

import java.util.Scanner;

public class MediaEscolar {

    String nomeDoAluno;
    double nota1DoAluno;
    double nota2DoAluno;
    double nota3DoAluno;
    double nota4DoAluno;
    double mediaFinalDoAluno;
    String alunoReprovadoOuAprovado;


    public void obterDadosDoAluno() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o nome do aluno? ");
        nomeDoAluno = leitor.nextLine();

        System.out.print("Qual a nota do " + nomeDoAluno + " no 1° Bimestre: ");
        nota1DoAluno = leitor.nextDouble();

        System.out.print("Qual a nota do " + nomeDoAluno + " no 2° Bimestre: ");
        nota2DoAluno = leitor.nextDouble();

        System.out.print("Qual a nota do " + nomeDoAluno + " no 3° Bimestre: ");
        nota3DoAluno = leitor.nextDouble();

        System.out.print("Qual a nota do " + nomeDoAluno + " no 4° Bimestre: ");
        nota4DoAluno = leitor.nextDouble();

        calcularMeidaDoAluno();
    }

    public void calcularMeidaDoAluno() {

        mediaFinalDoAluno = (nota1DoAluno + nota2DoAluno + nota3DoAluno + nota3DoAluno) / 4;

        definirSeAlunoPassouOuNao();
    }

    public void definirSeAlunoPassouOuNao() {
        if (mediaFinalDoAluno >= 5.0) {
            alunoReprovadoOuAprovado = "Aprovado";
        } else {
            alunoReprovadoOuAprovado = "Reprovado";
        }
        exibirMediaDoAluno();
    }

    public void exibirMediaDoAluno(){

        System.out.println("A média do " + nomeDoAluno + " é: " + mediaFinalDoAluno);

        System.out.print("O aluno " + nomeDoAluno + " está " + alunoReprovadoOuAprovado);
    }
}