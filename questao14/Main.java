package questao14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int[] array;
		long[] fatorial;
		array = new int[10];
		fatorial = new long[10];

		boolean condicao;
		do {

			for (int i = 0; i < array.length; i++) {
				System.out.print("Digite um numero: ");
				array[i] = entrada.nextInt();
			}

			System.out.println("Numero\tFatorial");
			for (int i = 0; i < fatorial.length; i++) {
				fatorial[i] = calcfat(array[i]);
				System.out.println(array[i] + "\t" + fatorial[i]);
			}

			System.out.print("Deseja executar uma nova operação ? <s/n> ");
			condicao = entrada.next().equalsIgnoreCase("s") ? true : false;
		} while (condicao);
		System.out.println("Programa Finalizado");

	}

	public static int calcfat(int a) {
		int m = 1;
		for (int i = 1; i <= a; i++) {
			m = m * i;
		}

		return m;
	}

}
