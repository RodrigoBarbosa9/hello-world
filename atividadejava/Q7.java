package atividadejava;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		String[] nome;
		float[] array1;
		float[] array2;
		nome = new String[20];
		array1 = new float[20];
		array2 = new float[20];

		for (int i = 0; i < array1.length; i++) {
			System.out.print("Digite o nome do aluno: ");
			nome[i] = entrada.next();
			System.out.print("Digite a n1 do(a) " + nome[i] + ": ");
			array1[i] = entrada.nextFloat();
			System.out.print("Digite a n2 do(a) " + nome[i] + ": ");
			array2[i] = entrada.nextFloat();

		}
		System.out.println("Nome\t\tN1\t\tN2\t\tMédia\t\tSituação");
		for (int i = 0; i < array2.length; i++) {
			float m = media(array1[i], array2[i]);
			if (m >= 7) {
				System.out.println(nome[i] + "\t\t" + array1[i] + "\t\t" + array2[i] + "\t\t" + m + "\t\tAPROVADO");
			}
			if (m < 7 && m > 4) {
				System.out.println(nome[i] + "\t\t" + array1[i] + "\t\t" + array2[i] + "\t\t" + m + "\t\tPROVA FINAL");
			}
			if (m < 4) {
				System.out.println(nome[i] + "\t\t" + array1[i] + "\t\t" + array2[i] + "\t\t" + m + "\t\tREPROVADO");
			}

		}

	}

	public static float media(float a, float b) {
		float m;
		m = (a + b) / 2;
		return m;
	}

}
