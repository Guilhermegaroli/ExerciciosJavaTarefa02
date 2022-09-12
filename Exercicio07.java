/*7) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo*/

package exercicio;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do Retângulo");
		
		int baseretangulo=sc.nextInt();
		
		System.out.println("Digite a altura do Retângulo");
		
		int alturaretangulo=sc.nextInt();
		int arearetangulo=baseretangulo*alturaretangulo;
		
		System.out.println("O valor da area do Retângulo é: " +arearetangulo);
		
		sc.close();

	}

}
