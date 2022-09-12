/*5) Solicite um valor do teclado e exiba a multiplicacao*/

package exercicio;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número que deseja multiplicar");

		int numero1=sc.nextInt();
		
		System.out.println("Digite o segundo numero que deseja multiplicar");
		
		int numero2=sc.nextInt();
		int multiplicacao=numero1*numero2;
		
		System.out.println("A multiplicação dos valores é: " +multiplicacao);
		
		sc.close();
	}

}
