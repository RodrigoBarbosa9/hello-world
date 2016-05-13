package atividadejava;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		String[] array;
		array = new String[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite o " + (i + 1) + " nome: ");
			array[i] = entrada.next();

		}
		System.out.println("A ordem dos nomes digitados é ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("O " + (i + 1) + " digitado foi : " + (array[i]));
		}

	}

}
