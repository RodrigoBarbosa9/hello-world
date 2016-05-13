package questao16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int[] array;
		int[] array2;
		int[] opcao;
		float[] result;
		array = new int[10];
		array2 = new int[10];
		opcao = new int[10];
		result = new float[10];

		boolean condicao;
		do {
			for (int i = 0; i < array.length; i++) {
				System.out.print("Digite o "+(i+1)+" valor do primeiro vetor: ");
				array[i] = entrada.nextInt();
				System.out.print("Digite o "+(i+1)+" valor do segundo vetor: ");
				array2[i] = entrada.nextInt();
			}
			menu();
			for (int i = 0; i < opcao.length; i++) {
				System.out.print("Digite agora qual o numero equivalente a operação: ");
				opcao[i] = entrada.nextInt();
				
				switch(opcao[i]){
					case 1:
						result[i] = (array[i]+array2[i]);
						break;
					case 2:
						result[i] = (array[i]-array2[i]);
						break;
					case 3:
						result[i] = (array[i]/array2[i]);
						break;
					case 4:
						result[i] = (array[i]*array2[i]);
						break;
					default:
						System.out.println("Numero digitado incorretamente");
						menu();
						System.out.print("Digite agora qual o numero equivalente ao vetor "+(i+1)+": ");
						opcao[i] = entrada.nextInt();
				}
			}
			
			for (int i = 0; i < result.length; i++) {
				if(opcao[i]==1){
					System.out.println(array[i]+" Somado com "+array2[i]+" = "+result[i]);
				}
				if(opcao[i]==1){
					System.out.println(array[i]+" Subtraido por "+array2[i]+" = "+result[i]);
				}
				if(opcao[i]==1){
					System.out.println(array[i]+" Dividido por "+array2[i]+" = "+result[i]);
				}
				if(opcao[i]==1){
					System.out.println(array[i]+" Multiplicado por "+array2[i]+" = "+result[i]);
				}
			}
			
			System.out.print("Deseja executar uma nova operação ? <s/n>: ");
			condicao = entrada.next().equalsIgnoreCase("s") ? true : false;
		} while (condicao);
		System.out.println("Programa Finalizado");
	}
	public static void menu(){
		System.out.println("*******Escolha de acordo com o menu********");
		System.out.println("1 - Para Somar os Valores");
		System.out.println("2 - Para Subtrair os Valores");
		System.out.println("3 - Para Dividir os Valores");
		System.out.println("4 - Para Multiplicar os valores");
	}

}