package Exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int qtdAlunos = 5;
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<Aluno>();
        float menorNota = Float.MAX_VALUE;
        float maiorNota = Float.MIN_VALUE;
        int qtdReprovados = 0, qtdReprovadosFalta = 0;

        for(int i = 0; i < qtdAlunos; i++){
            System.out.print("Informe a matrícula do " + (i+1) + "o aluno: ");
            String matricula = sc.nextLine();
            System.out.print("Informe a primeira nota: ");
            float nota1 = sc.nextFloat();
            if(nota1 > maiorNota){
                maiorNota = nota1;
            }
            if(nota1 < menorNota){
                menorNota = nota1;
            }
            System.out.print("Informe a segunda nota: ");
            float nota2 = sc.nextFloat();
            if(nota2 > maiorNota){
                maiorNota = nota2;
            }
            if(nota2 < menorNota){
                menorNota = nota2;
            }
            System.out.print("Informe a terceira nota: ");
            float nota3 = sc.nextFloat();
            if(nota3 > maiorNota){
                maiorNota = nota3;
            }
            if(nota3 < menorNota){
                menorNota = nota3;
            }
            System.out.print("Informe a frequência: ");
            int frequencia = sc.nextInt();
            sc.nextLine();

            alunos.add(new Aluno(matricula, nota1, nota2, nota3, frequencia));

        }

        for(Aluno aluno : alunos){
            System.out.println("Matrícula: " + aluno.getMatricula());
            float notaFinal = (aluno.getNota1() + aluno.getNota2() + aluno.getNota3()) / 3;
            System.out.println("Nota final: " + notaFinal);
            if(notaFinal > 6 && aluno.getFrequencia() > 75){
                System.out.println("Aluno aprovado");
            }
            else if(notaFinal > 6 && aluno.getFrequencia() < 75){
                System.out.println("Aluno reprovado por falta");
                qtdReprovados += 1;
                qtdReprovadosFalta +=1;
            }
            else {
                System.out.println("Aluno reprovado");
                qtdReprovados += 1;
            }
            System.out.println();
        }

        float porcentagemReprovadosFalta = (qtdReprovadosFalta * 100) / qtdReprovados;
        System.out.println("A menor nota da turma: " + menorNota);
        System.out.println("A maior nota da turma: " + maiorNota);
        System.out.println("Quantidade de alunos reprovados: " + qtdReprovados);
        System.out.printf("Porcentagem de alunos reprovados por falta: %.0f%%", porcentagemReprovadosFalta);
    }
}
