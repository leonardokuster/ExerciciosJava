package pacoteWhile;

import java.util.*;

public class ClasseWhile {

	public static void main(String[] args) {
		
		char saida = 'N';
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0;
		
		while (saida != 'S') {
			System.out.print("Digite um número: ");
			numero = entrada.nextInt();
			entrada.nextLine();
			
			System.out.print("Deseja sair do programa? (S -> Sim, N -> Não)");
			saida = entrada.nextLine().charAt(0);
			
			somatorio = somatorio + numero;
		}
		
		System.out.printf("O somatório é: %d.", somatorio);

	}

}
