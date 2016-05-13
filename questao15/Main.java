package questao15;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		float p=0;
		float m=0;
		float media=0;
		int par=0;
		int menor=10000000;
		int maior=0;
		int[] array;
		array = new int[10];
		
		boolean condicao;
		do{
			
			for (int i = 0; i < array.length; i++) {
				System.out.print("Digite um numero: ");
				array[i] = entrada.nextInt();
				media = (media+array[i]);	
				if (array[i] < menor){
					menor = array[i];
				}
				if(array[i] > maior){
					maior = array[i];
					
				}
				if(array[i] % 2 == 0){
					par=par+1;
				}
			}
			
			for (int i = 1; i <= 6; i++) {
				p = calc(par,i);
				m = media(media,i);
				
			}
			
			//System.out.println("");
			
			System.out.println("Maior numero: "+maior);
			System.out.println("Menor numero: "+menor);
			System.out.println("Quantidade de numeros pares: "+par);
			System.out.println("Percentual de numeros pares: "+p+"%");
			System.out.println("Media do vetor: "+m);
			
			System.out.print("Deseja executar uma nova operacao ? <s/n>: ");
			condicao = entrada.next().equalsIgnoreCase("s") ? true : false;
		}while(condicao);
		System.out.println("Programa Finalizado");
	}
	public static float calc(float a, float b){
		float m=0;
		m = (a/b)*100;
		
		return m;
	}
	public static float media(float a, float b){
		float m=0;
		m = a/b;
		
		return m;
	}
}
