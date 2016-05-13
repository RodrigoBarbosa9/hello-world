package questao13;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int[] array;
		int[] array2;
		array = new int[10];
		array2 = new int[10];

		int m = 0;
		boolean condicao;
		do{
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite o " + (i + 1) + " numero inteiro não negativo: ");
			array[i] = entrada.nextInt();
			array2[i] = array[i];

			if (array[i] < 0) {
				break;
			}
		}
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] == 0) {
				break;
			}
			System.out.println("numero: " + troca(array2[i]));
		}
		
			System.out.print("Deseja executar uma nova operacao ? <s/n>: ");
			condicao = entrada.next().equalsIgnoreCase("s") ? true : false;
		}while(condicao);
		System.out.println("Programa Finalizado");
	}

	public static int troca(int a) {
		int m;
		m = (a * -1);
		return m;
	}
}
