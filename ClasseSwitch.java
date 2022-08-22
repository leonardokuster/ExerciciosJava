package pacoteSwitch;

import java.util.*;

public class ClasseSwitch {

	public static void main(String[] args) {
		
		char operacao = ' ';
		Scanner entrada = new Scanner(System.in);
		double n1 = 0, n2 = 0, total = 0;
		
		System.out.print("Digite o valor do primeiro número: ");
		n1 = entrada.nextDouble();
		
		System.out.print("Digite o valor do segundo número: ");
		n2 = entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.print("Digite a operação desejada (+,-,/,*,%): ");
		operacao = entrada.nextLine().charAt(0);
		
		switch (operacao) {
			case ('+'): total = n1 + n2; break;
			case ('-'): total = n1 - n2; break;
			case ('/'): total = n1 / n2; break;
			case ('*'): total = n1 * n2; break;
			case ('%'): total = n1 % n2; break;
			default: System.out.println("O caractere não é reconhecido para esta operação.");
		}
		
		if (operacao == '+' || operacao == '-' || operacao == '/' || operacao == '*' || operacao == '%')
			System.out.printf("%.2f %c %.2f = %.2f", n1, operacao, n2, total);
			
	}

}
