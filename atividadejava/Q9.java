package atividadejava;

import java.util.Arrays;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		float[] array1;
		float[] array2;
		array1 = new float[10];
		array2 = new float[10];

		for (int i = 0; i < array1.length; i++) {
			System.out.print("Digite o preco de compra do " + (i + 1) + " Produto: ");
			array1[i] = entrada.nextInt();
			System.out.print("Digite o preco de venda do " + (i + 1) + " Produto: ");
			array2[i] = entrada.nextInt();

		}
		for (int i = 0; i < array1.length; i++) {
			float lucro = percentual_lucro(array1[i], array2[i]);
			if (lucro < 10) {
				System.out.println("A " + (i + 1) + " Mercadoria, obteve um lucro menor que 10% = " + lucro);
			}
			if (lucro > 10 && lucro < 20) {
				System.out.println("A " + (i + 1) + " Mercadoria, obteve um lucro medio entre 10% e 20% = " + lucro);
			}
			if (lucro > 20) {
				System.out.println("A " + (i + 1) + " Mercadoria, obteve um lucro maior que 20% = " + lucro);
			}

		}
	}

	public static float percentual_lucro(float a, float b) {
		float m, lucro;
		lucro = b - a;
		m = (lucro / b) * 100;
		return m;
	}

}
