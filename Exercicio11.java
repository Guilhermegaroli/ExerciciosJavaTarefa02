/* Escreva um algoritmo para ler as dimensões de um trapézio (base amior, base menor e altura), calcular e escrever a área do trapézio*/

package exercicio;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a base maior do trapezio");	
		
	float  basemaior=sc.nextFloat();	

	System.out.println("Digite a base menor do trapezio");
	
	float basemenor=sc.nextFloat();
	
	System.out.println("Digite a altura do trapezio");
	
	float altura=sc.nextFloat();
	float area=(basemaior+basemenor)*altura/2;
	
	System.out.println("A area do trapezio é: " +area);
	
	sc.close();
	
	}

}
