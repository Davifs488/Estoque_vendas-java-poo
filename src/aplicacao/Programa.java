package aplicacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Programa {
/*
 * Esse e um programa que o clienteai digitar o valor ,quantidade e pre�o
 * E ap�s colocara se vai colocar algo no estoque
 * depois colocar se teve vendas
 * O programa finaliza com quantidade no estoque atual e valor de vendas
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ProdsEmpresa produto = new ProdsEmpresa();
		
		System.out.println("Nome do produto: ");
		produto.produto = sc.next();
		
		System.out.println("Insira a quantidade: ");
		produto.quantidade = sc.nextDouble();
		
		System.out.println("Isira o Pre�o individual:");
		produto.preco = sc.nextDouble();
		
		System.out.println("Confirma��o: "+produto.produto+",\n Estoque: "+produto.quantidade+"\n Pre�o: "+produto.preco);
		
		System.out.println("Deseja acrescentar produto ao estoque ?");
		int estoque = sc.nextInt();
		produto.addProdutos(estoque);
		System.out.println("Atauliza��o: "+produto.produto+",\n Estoque atual: "+produto.quantidade+"\n Pre�o: "+produto.preco);
		
		System.out.println("Foi realizada alguma venda no per�udo ?");
	    estoque = sc.nextInt();
		produto.subProdutos(estoque);
		System.out.println("Atauliza��o ap�s vendas: "+produto.produto+",\n Estoque atual: "+produto.quantidade+"\n Pre�o: "+produto.preco+
				" Valor atual do estoque: R$ "+produto.quantidade*produto.preco);
		
		
		JOptionPane.showMessageDialog(null, "Atauliza��o ap�s vendas: "+produto.produto+", Estoque atual: "+produto.quantidade+" Pre�o: "+produto.preco+
				" Valor atual do estoque: R$ "+produto.quantidade*produto.preco);
		
		
		
		sc.close();
	}

}
