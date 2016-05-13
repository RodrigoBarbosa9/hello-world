package atividadejava;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String letra[] = { "L", "M", "N", "O", "P", "Q", "R", "S" };
		String[] nome;
		int[] idade;
		nome = new String[2];
		idade = new int[2];

		for (int i = 0; i < nome.length; i++) {
			System.out.print("Digite um nome: ");
			nome[i] = entrada.next();
			System.out.print("Digite a idade do(a) " + nome[i] + ": ");
			idade[i] = entrada.nextInt();

		}
		System.out.println("Nomes que entram na Regra");

		for (int i = 0; i < nome.length; i++) {
			char inicial = (nome[i].charAt(0));

			if (inicial == 'L') {
				System.out.println(nome[i]);
			}
			if (inicial == 'M') {
				System.out.println(nome[i]);
			}
			if (inicial == 'N') {
				System.out.println(nome[i]);
			}
			if (inicial == 'O') {
				System.out.println(nome[i]);
			}
			if (inicial == 'P') {
				System.out.println(nome[i]);
			}
			if (inicial == 'Q') {
				System.out.println(nome[i]);
			}
			if (inicial == 'R') {
				System.out.println(nome[i]);
			}
			if (inicial == 'S') {
				System.out.println(nome[i]);
			}
		}

	}

}
