//Comentario Inline - Em linha

/*Comentário Multelinha*/
/*1) Solicite um valor do teclado e exiba o seu sucessor.*/

/**
 * JavaDoc
 * @author Thayna
 */
package exercicio;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Digite um número");
		
		int numero=sc.nextInt();
		int sucessor=numero+1;
				
				System.out.println("O sucessor de " +numero+ " é : " +sucessor);
		sc.close();
	}
}