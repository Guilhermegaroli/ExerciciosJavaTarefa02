/*4) Solicite um valor do teclado e exiba a subtracao*/

package exercicio;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número que deseja subtrair");
		
		int numero1=sc.nextInt();
		
		System.out.println("Digite o segundo numero que deseja subtrair");
		
		int numero2=sc.nextInt();
		int subtracao=numero1-numero2;
		   
		  System.out.println("A subtração dos valores é: " +subtracao);
		
		sc.close();
	}

}
