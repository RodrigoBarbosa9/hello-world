package questao20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		boolean condicao;
		do {
			
			String[] array;
			array = new String[12];
			
			for (int i = 0; i < array.length; i++) {
				System.out.print("Digite o nome do "+(i+1)+" time: ");
				array[i] = entrada.next();
				
			}
			System.out.println("Os times a se enfrentarem serao:");
		
				System.out.println(array[0] + " vs " + array[2]);
				System.out.println(array[1] + " vs " + array[3]);
				System.out.println(array[4] + " vs " + array[6]);
				System.out.println(array[5] + " vs " + array[7]);
				System.out.println(array[8] + " vs " + array[10]);
				System.out.println(array[9]+  " vs " + array[11]);
				
				System.out.println("------------------------");
		

			System.out.print("Deseja executar uma nova operação ? <s/n>: ");
			condicao = entrada.next().equalsIgnoreCase("s") ? true : false;
		} while (condicao);
		System.out.println("Programa Finalizado");
	}

}
