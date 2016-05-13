package atividadejava;

import java.util.Scanner;
import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		String[] array;
		array = new String[10];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite o " + (i + 1) + " nome: ");
			array[i] = entrada.next();
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("Na posicao " + (i + 1) + " esta o nome : " + array[i]);
		}

	}

}
