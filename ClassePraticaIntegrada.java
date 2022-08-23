package pacoteClasseIntegrada;

import java.util.*;

public class ClassePraticaIntegrada {

	public static void main(String[] args) {
		
		Scanner entradaCaractere = new Scanner(System.in);
		Scanner entradaNumeros = new Scanner(System.in);
		char operacao = ' ';
		int[] numeros = new int[1000];
		int i =0, somatorio = 0, contaPares = 0;
		double media = 0;
		
		do {
			System.out.printf("Menu de opcoes:\n"
					+ "D - para digitar novos numeros.\n"
					+ "Z - para apresentar o somatorio dos numeros.\n"
					+ "V - para visualizar todos os numeros digitados.\n"
					+ "P - para a quantidade de numeros digitados.\n"
					+ "M - para a media simples dos numeros digitados.\n"
					+ "Q - para a quantidade de pares.\n"
					+ "S - para sair do programa.\n");
			operacao = entradaCaractere.nextLine().charAt(0);
			
			switch(operacao) {
				case 'D': 
					System.out.print("Digite o numero desejado: ");
					numeros[i] = entradaNumeros.nextInt();
					i++;
					break;
				case 'Z': 
					for(int j = 0;  j < i; j++) {
						somatorio = somatorio + numeros[j];
					}
					System.out.printf("O somatorio dos numeros é: %d\n", somatorio);
					break;
				case 'V':
					for(int j = 0;  j < i; j++) {
						System.out.printf("%d\n", numeros[j]);
					}
					break;
				case 'P':
					System.out.printf("Foram digitados %d numeros.\n", i);
					break;
				case 'M':
					for(int j = 0;  j < i; j++) {
						somatorio = somatorio + numeros[j];
					}
					media = somatorio/(i);
					System.out.printf("A media simples dos numeros digitados é: %.2f\n", media);
					break;
				case 'Q':
					for(int j = 0;  j < i; j++) {
						if (numeros[j] % 2 == 0)
							contaPares = contaPares + 1;
					}
					System.out.printf("Quantidade de numeros pares: %d\n", contaPares);
					break;
				case 'S':
					break;
				default:
					System.out.print("Opcao invalida.\n");
			}
		} while(operacao != 'S');
		
		System.out.println("Fim da operacao.");
	}
}
