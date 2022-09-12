//Comentario Inline - Em linha

/*Comentário Multelinha*/
/*2) Solicite um valor do teclado e exiba o seu antecessor.*/

/**
 * JavaDoc
 * @author Thayna
 */
package exercicio;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Digite um número");
		
		int numero=sc.nextInt();
		int antecessor=numero-1;
		     
			    	
				System.out.println("O sucessor de " +numero+ " é : " +antecessor);
		sc.close();
	}
}