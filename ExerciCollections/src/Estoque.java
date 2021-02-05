//Crie uma um programa para trabalhar com estoque de uma loja, o programa
//dever� trabalhar com Collection do tipo List do Java para manipular 
//os dados desse estoque, o programa dever� atender as seguintes funcionalidades:
//Armazenar dados da List
//Remover dados da list;
//Atualizar dados da list.
//Apresentar todos os dados da list.

//O que vc quer fazer?
	//Um estoque onde eu consiga colocar as inf de prod e qtde

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Estoque {

	public static void main (String args [])
	{
// Inserindo vari�veis		
		int option;
		String product;
						
//Instanciando objetos
		Scanner ler = new Scanner (System.in);
		ArrayList<String> estoque = new ArrayList();
		
//Iniciando Execu��es
		
	System.out.println("***** Estoque Renner *****");
do {	
	
	
	System.out.print("\nDigite a sua op��o:\n1- Adicionar Produto \n2- Excluir Produto \n3- Atualizar Estoque \n4- Acessar Produtos do Estoque\n5-Encerrar Sistema\nDigite a op��o:");
	option = ler.nextInt();
	
		if (option==1)
		{
			System.out.println("\nQual produto que ser� adicionado ao estoque? ");
			product = ler.next();
			
				if(estoque.contains(product))
					{
						System.out.println("\nProduto j� existe no estoque!");
					}
				else 
					{
					estoque.add(product);
					System.out.println("Produto adicionado com sucesso!");
					}
		}
								
		else if (option==2)
		{
			System.out.println("Qual produto que ser� excluido do estoque? ");
			product = ler.next();
			
				if(estoque.contains(product))
					{
					estoque.remove(product);
					System.out.println("Produto excluido com sucesso!");
					}
				else 
					{
					System.out.println("Produto n�o existe no estoque!");
					}
		}
		else if (option==3)
		{
			System.out.println("Qual produto que ser� exclu�do do estoque? ");
			product = ler.next();
			
				if(estoque.contains(product))
					{
					estoque.remove(product);
					System.out.println("Qual produto ser� adicionado? ");
					product = ler.next();
					estoque.add(product);

					}
				else 
					{
					System.out.println("Produto n�o existe no estoque!");
					}
		}
		else if (option==4)
		{
			Collections.sort(estoque);
			estoque.forEach(produto-> {
				System.out.println("Os produtos do estoque s�o \n"+produto);
			});
		}
		
			
}while (option != 5);

System.out.println("Obrgado por utilizar o nosso sistema!!!");
	}
}
