package pacoteVetor;

import java.util.*;

public class ClasseVetor {

	public static void main(String[] args) {
		
		int[] numeros = new int[5];
		int total = 0, somatorio = 0, i;
		Scanner entrada = new Scanner(System.in);
		
		for (i = 0; i < 5; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			numeros[i] = entrada.nextInt();
			somatorio = somatorio + numeros[i];
		}
		
		System.out.printf("O somatório dos números digitados é: %d.\n)", somatorio);
	}

}
