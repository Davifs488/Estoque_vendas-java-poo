package aplicacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Programa {
/*
 * Esse e um programa que o clienteai digitar o valor ,quantidade e preço
 * E após colocara se vai colocar algo no estoque
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
		
		System.out.println("Isira o Preço individual:");
		produto.preco = sc.nextDouble();
		
		System.out.println("Confirmação: "+produto.produto+",\n Estoque: "+produto.quantidade+"\n Preço: "+produto.preco);
		
		System.out.println("Deseja acrescentar produto ao estoque ?");
		int estoque = sc.nextInt();
		produto.addProdutos(estoque);
		System.out.println("Ataulização: "+produto.produto+",\n Estoque atual: "+produto.quantidade+"\n Preço: "+produto.preco);
		
		System.out.println("Foi realizada alguma venda no períudo ?");
	    estoque = sc.nextInt();
		produto.subProdutos(estoque);
		System.out.println("Ataulização após vendas: "+produto.produto+",\n Estoque atual: "+produto.quantidade+"\n Preço: "+produto.preco+
				" Valor atual do estoque: R$ "+produto.quantidade*produto.preco);
		
		
		JOptionPane.showMessageDialog(null, "Ataulização após vendas: "+produto.produto+", Estoque atual: "+produto.quantidade+" Preço: "+produto.preco+
				" Valor atual do estoque: R$ "+produto.quantidade*produto.preco);
		
		
		
		sc.close();
	}

}
