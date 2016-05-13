package questao11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int opcao, opcao2;

		float[] venda;
		float[] compra;
		int[] quantidade;
		int[] codigo;
		String[] nome;
		venda = new float[1];
		compra = new float[1];
		quantidade = new int[1];
		codigo = new int[1];
		nome = new String[1];

		boolean condicao;
		do {

			for (int i = 0; i < nome.length; i++) {
				System.out.print("Digite o nome do produto: ");
				nome[i] = entrada.nextLine();
				System.out.print("Digite a quantidade do " + nome[i] + ": ");
				quantidade[i] = entrada.nextInt();
				System.out.print("Digite o valor do " + nome[i] + ": ");
				compra[i] = entrada.nextFloat();
				System.out.print("Digite o valor de venda do " + nome[i] + ": ");
				venda[i] = entrada.nextFloat();
				System.out.print("Digite o codigo do " + nome[i] + ": ");
				codigo[i] = entrada.nextInt();
			}
			menu();

			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("NOME\tQUANTIDADE\tCOMPRA\tVENDA\tCODIGO");
				for (int i = 0; i < nome.length; i++) {
					System.out.println(
							nome[i] + "\t" + quantidade[i] + "\t" + compra[i] + "\t" + venda[i] + "\t" + codigo[i]);
				}
				break;
			case 2:
				System.out.println("Informe o codigo");
				opcao2 = entrada.nextInt();
				for (int i = 0; i < nome.length; i++) {
					if (opcao2 == codigo[i]) {
						System.out.println("NOME\tQUANTIDADE\tCOMPRA\tVENDA\t");
						System.out.println(nome[i] + "\t" + quantidade[i] + "\t" + compra[i] + "\t" + venda[i]);
					}
				}
			}
			System.out.print("Deseja executar uma nova operação <s/n>? ");
			condicao = entrada.next().equalsIgnoreCase("s") ? true : false;
		} while (condicao);
		System.out.println("Programa finalizado");

	}

	public static void menu() {
		// System.out.println("****BEM VINDO AO MERCADINHO DO RODRIGO*******");
		System.out.println("****Escolha a opção*******");
		System.out.println("1 - Listagem de todos os produtos");
		System.out.println("2 - Buscagem pelo código");
	}

}