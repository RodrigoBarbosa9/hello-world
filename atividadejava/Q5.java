package atividadejava;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int[] array;
		array = new int[15];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite o " + (i + 1) + " numero: ");
			array[i] = entrada.nextInt();

		}

		for (int i = 0; i < array.length; i++) {
			if (par(array[i]) == true) {
				System.out.println("O numero " + (array[i]) + " está na posicao: " + (i + 1) + " e é par ");
			} else {
				System.out.println("O numero " + (array[i]) + " está na posicao: " + (i + 1) + " e é impar ");
			}

		}

	}

	public static boolean par(int b) {
		if (b % 2 == 0) {
			return true;
		}
		return false;

	}

}
