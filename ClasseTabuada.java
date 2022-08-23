package pacoteTabuada;

import java.util.*;

public class ClasseTabuada {

	public static void main(String[] args) {
		
		int i = 0, j = 0;
		
		for (i = 0; i <= 20; i++) {
			System.out.printf("Tabuada do %d.\n", i);
			for (j = 0; j <= 20; j++) {
				System.out.printf("%d * %d = %d. \n", i, j, i*j);
			}
		}
	}

}
