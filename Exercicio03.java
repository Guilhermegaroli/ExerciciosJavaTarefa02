/*3) Solicite um valor do teclado e exiba a soma*/

package exercicio;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite o primeiro número que deseja somar");

		int numero1=sc.nextInt();
	
		System.out.println("Digite o segundo número que deseja somar");
		
		int numero2=sc.nextInt();
		int soma=numero1+numero2;
				
			System.out.println("O valor da soma é: " +soma);	
	sc.close();
	}

}
