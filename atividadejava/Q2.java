package atividadejava;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		String[] array;
		array = new String[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite " + (i + 1) + " nome :");
			array[i] = entrada.next();
		}

		menu();

		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.println(array[0]);
			break;
		case 2:
			System.out.println(array[1]);
			break;
		case 3:
			System.out.println(array[2]);
			break;
		case 4:
			System.out.println(array[3]);
			break;
		case 5:
			System.out.println(array[4]);
			break;
		default:
			System.out.println("Você digite um numero invalido");

		}

	}

	public static void menu() {
		System.out.println("****Escolha a opção****");
		System.out.println("1 - Para vêr o Primeiro nome");
		System.out.println("2 - Para vêr o Segundo nome");
		System.out.println("3 - Para vêr o Terceiro nome");
		System.out.println("4 - Para vêr o Quarto nome");
		System.out.println("5 - para ver o Quinto nome");
	}

}
