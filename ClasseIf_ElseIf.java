package pacoteIf_ElseIf;

import java.math.*;
import java.util.*;

public class ClasseIf_ElseIf {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, mediaNotas;
		String situacao;
		
		Scanner entradaNotas = new Scanner(System.in);
		Scanner entradaCaractere = new Scanner(System.in);
		Scanner entradaFrequencia = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = entradaCaractere.nextLine();
		
		System.out.print("Digite um caractere para a situação do aluno (O -> OK; P -> Pendência): ");
		char statusAluno = entradaCaractere.nextLine().charAt(0);
		
		System.out.print("Digite a primeira nota do aluno: ");
		nota1 = entradaNotas.nextDouble();
		
		System.out.print("Digite a segunda nota do aluno: ");
		nota2 = entradaNotas.nextDouble();
		
		System.out.print("Digite a terceira nota do aluno: ");
		nota3 = entradaNotas.nextDouble();
		
		System.out.print("Digite a quarta nota do aluno: ");
		nota4 = entradaNotas.nextDouble();
		
		mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.print("Digite a frequênica de comparecimento do aluno (0 a 1): ");
		frequencia = entradaFrequencia.nextDouble();
		
		
		if (mediaNotas >= 7 && frequencia >= 0.75) {
			if (mediaNotas >= 9)
				situacao = "Aprovado com conceito A.";
			else if (mediaNotas >= 8 && mediaNotas < 9)
				situacao = "Aprovado com conceito B.";
			else
				situacao = "Aprovado com conceito C.";
		}
		else if (mediaNotas >= 4 && frequencia >= 0.75)
			situacao = "em Recuperação.";
		else 
			situacao = "Reprovado.";
		
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequência %.2f%%.\n" + "Com isso, o aluno(a) está %s.", nomeAluno, mediaNotas, frequencia*100, situacao );

	}

}
