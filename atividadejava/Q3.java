package atividadejava;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		String[] array;
		array = new String[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite " + (i + 1) + " nome :");
			array[i] = entrada.next();
		}
		System.out.print("Digite a palavra que você quer procurar :");
		String opcao = entrada.next();

		for (int i = 0; i < array.length; i++) {
			if (opcao.equals(array[i])) {
				System.out.println(" O nome foi encontrado na posicao " + (i + 1) + " e com o nome " + array[i]);

			}
		}

	}
}