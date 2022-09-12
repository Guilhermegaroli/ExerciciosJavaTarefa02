/*9) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado. Dica a=l² */

package exercicio;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a medida de um lado do quadrado");

		int ladoquadrado = sc.nextInt();
		int area = ladoquadrado*4;

		System.out.println("A area do quadrado é: " + area);

		sc.close();
	}

}
