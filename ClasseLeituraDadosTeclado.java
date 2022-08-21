package pacoteLeituraDadosTeclado;

import java.math.*;
import java.util.*;

public class ClasseLeituraDadosTeclado {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		boolean aprovado;
		
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
		
		totalNotas = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.print("Digite a frequênica de comparecimento do aluno (0 a 1): ");
		frequencia = entradaFrequencia.nextDouble();
		
		aprovado = totalNotas >= 7 && frequencia >= 0.75;
		
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequência %.2f%%. A situação do(a) aluno(a) é %c.\n" + "Aluno aprovado? %b.", nomeAluno, totalNotas, frequencia*100, statusAluno, aprovado );

	}

}
