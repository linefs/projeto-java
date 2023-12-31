package ecommerce1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.model.Carrinho;
import ecommerce.model.Ecommerce2;

public class Menu {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Shpping do Povo               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Ofertas do Dia                       ");
			System.out.println("            2 - Produtos do Povo                     ");
			System.out.println("            3 - Seu carrinho                         ");
			System.out.println("            4 - Seus pedidos                         ");
			System.out.println("            5 - Sua Conta                            ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				sobre();
                 		leia.close();
				System.exit(0);
			}

			if (opcao == 6) {
				System.out.println("\nShopping do Povo, mais barato só se for doado!");
                 leia.close();
				System.exit(0);
				
			}

			switch (opcao) {
				case 1:
					System.out.println("Ofertas do Dia\n\n");

					break;
				case 2:
					System.out.println("Produtos do Povo\n\n");

					break;
				case 3:
					System.out.println("Consulte seu Carrinho aqui\n\n");

					break;
				case 4:
					System.out.println("Acompanhe seus Pedidos\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Aline Freitas de Souza");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	}

public static void keyPress() {

	try {

		System.out.println("\n\nPressione Enter para Continuar...");
		System.in.read();

	} catch (IOException e) {

		System.out.println("Você pressionou uma tecla diferente de enter!");

	}
}
}
			
		