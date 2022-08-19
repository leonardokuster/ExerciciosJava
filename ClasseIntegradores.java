package pacoteIntegradores;

import java.math.*;

public class ClasseIntegradores {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
	    char statusAluno;
	    boolean aprovado;
	    String nomeAluno;
	    
	    nomeAluno = "Leonardo Cristiano Kuster";
	    statusAluno = 'M';
	    
	    nota1 = 8.2;
	    nota2 = 6.5;
	    nota3 = 9.0;
	    nota4 = 5.9;
	    
	    frequencia = 0.80;
	    
	    totalNotas = (nota1 + nota2 + nota3 + nota4) / 4;
	    
	    aprovado = totalNotas >= 7 && frequencia >= 0.75;
	    
	    System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequência %.2f%%. A situação do(a) aluno(a) é %c.\n" + "Aluno aprovado? %b.", nomeAluno, totalNotas, frequencia*100, statusAluno, aprovado );

	}

}