import java.util.Locale;
import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
//Esse e um projeto com Quatro exemplos	
//de repetições		
		
		
		   

		
		 // 1º EXEMPLO E WHELI
		//REPETIÇAÕ crescente/decr.
		//O comando e"x" ou "y" e espeço depois o outro valor
		
		      
		       
		      
		        /*+++++++++++++++++++++++++++++++++++

		 int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		while(x != y) {
			if(x < y) {
				System.out.println("Crescente");
			}
			else {
				System.out.println("Decrecente");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		       
		       
		       
		      
+++++++++++++++++++++++++++++*/
		
		
		
		
		
		
		// 2º EXEMPLO DE REPETICAO
	//você vai digitando valores até
//Digitar o zero,chegando no zero
//para e vem o resultado da soma.
		      
		
		
		      /*§§§§§§§§§§§§§§§§§§§§§§§
		
		int x = sc.nextInt();
		int soma = 0;
		
		 while( x != 0) {
			 soma = soma + x;
			 
			x =sc.nextInt();
		 }
		 
		 System.out.println(soma);
		       
		       
§§§§§§§§§§§§§§§§§§§§§§§§§*/
		       
		       
		
		
		
		//  3º Exemplo 
//Mostra o menor numero de três numeros digitados
		
		
                /* **********************************		
 
        int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a < b && a < c) {
			System.out.println(" MENOR =" + a);
	    }else if(b < c) {
	    	System.out.println("MENOR =" + b);
	    }else {
	    	System.out.println("MENOR =" + c);
	    }        

              
************************** */
		
			
		
		
       // 4º Exemplo
	//E mostrado a nota,media e se foi aprovado/reprovado
		
		                 
		        
		System.out.println("Bom dia ");
		System.out.println("Esse e um programa de media escolar.");
		System.out.println("Por favor siga os comandos.");
                    
		System.out.println("Digite a primeira nota.");
		System.out.println("Com valores de 1 a 10.\n");
              double nota1 = sc.nextDouble();
        System.out.println("Digite a segund  nota:\n");
		      double nota2 = sc.nextDouble();
	    System.out.println("Digite a terceira nota:\n");      
		      double nota3 = sc.nextDouble(); 
		      
		      double media;
		      media = 3;
		      media =(nota1 + nota2 + nota3) / media;
		      double notaFinal;
		      notaFinal =( nota1 + nota2 + nota3) / 3;
		      
		      System.out.printf("Media = %.1f\n ",media);
		      System.out.printf("Nota Final = %.1f\n " ,notaFinal);
		      if(notaFinal >= 6) {
			  System.out.println("Aluno Aprovado parabens");
		      }else {
			  System.out.println("Você esta reprovado");
			  
	
		}           
		            
		             
		

		
		
		
		sc.close();
		
	}
	
	

}
