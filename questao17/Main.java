package questao17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int codigo;
		int[] mesas;
		int[] lugar;
		mesas = new int[30];
		lugar = new int[30];

		boolean condicao;
		do {
			menu();
			
			for (int i = 0, valor = 99; i < mesas.length; i++,valor++) {
				mesas[i] = valor+1;
			}
			
			System.out.print("Digite o codigo da mesa (100 a 129) : ");
			codigo = entrada.nextInt();
			
			for (int i = 0; i < mesas.length; i++) {
				if(codigo == mesas[i]){
					if(lugar[i] == 0){
						System.out.println("A mesa "+(mesas[i])+" está disponivel");
						menu2();
						System.out.print("Deseja fazer qual operacao?: ");
						int opcao = entrada.nextInt();
						
						switch(opcao){
							case 1:
								System.out.print("Quantos lugares deseja ter na mesa?: ");
								int opcao2 = entrada.nextInt();
								lugar[i] = opcao2;
								System.out.println("Reserva feita com sucesso");
								System.out.println("A mesa "+mesas[i]+" está reservado para "+(lugar[i])+" lugares");
								break;
							default:
								System.out.println("Tenha um bom dia Sehnor!");
								break;
						}
					}
					else{
						System.out.println("A mesa "+(mesas[i])+" não está está disponivel para novas reservas");
						System.out.println("Mas podem ser feitas as seguintes operações");
						menu3();
						int opcao3 = entrada.nextInt();
						switch(opcao3){
							case 1:
								System.out.print("Deseja que a mesa "+mesas[i]+" tenha quantos lugares?: ");
								int opcao4 = entrada.nextInt();
								lugar[i] = opcao4;
								System.out.println("Reserva feita com sucesso");
								System.out.println("A mesa "+mesas[i]+" está reservado para "+(lugar[i])+" lugares");
								break;
							case 2:
								System.out.print("Deseja que a mesa "+mesas[i]+" seja cancelada? <S/N>: ");
								boolean opcao5 = entrada.next().equalsIgnoreCase("s") ? true : false;
								if(opcao5 == true){
									lugar[i] = 0;
									System.out.println("Cancela feita com sucesso!");
								}else{
									System.out.println("Desistiu de fazer a cancelagem");
									break;
								}
								break;
							default:
								System.out.println("Tenha um bom dia Sehnor!");
								break;
						}
					}
					
				}
				if(codigo > 129 || codigo < 100){
					System.out.println("Desculpe, o senhor digitou um codigo errado");
					break;
				}
			}

			System.out.print("Deseja executar uma nova operação ? <s/n>: ");
			condicao = entrada.next().equalsIgnoreCase("s") ? true : false;
		} while (condicao);
		System.out.println("Programa Finalizado");
	}
	public static void menu(){
		System.out.println("****Bem vindo a Bufet Java******");
		System.out.println("Temos no total o espaço para 30 Mesas");
		System.out.println("Com 5 Cadeiras cada, totalizando o total de 150 Cadeiras");
		System.out.println("Para Verificar uma mesa, por favor faça as seguinte operações:  ");
		System.out.println("                              ");
	}
	public static void menu2(){
		System.out.println("Digite um numero para efetuar a operação");
		System.out.println("1 - Para Fazer uma reserva de lugares");
		System.out.println("2 - Para Sair da Programa");
	}
	public static void menu3(){
		System.out.println("Digite um numero para efetuar a operação");
		System.out.println("1 - Para Fazer uma atualizacao de lugares");
		System.out.println("2 - Para Cancelar a reserva");
		System.out.println("3 - Para Sair da Programa");
	}
}
