/*8) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo */

package exercicio;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite a base do triângulo");
		
	    float basetriangulo=sc.nextFloat(); 
	    	    
	    System.out.println("Digite a altura do triângulo");
	    
	   float alturatriangulo=sc.nextFloat();
	   float areatriangulo=basetriangulo*alturatriangulo/2;
	   
	   System.out.println("O Valor da area do triangulo é: " +areatriangulo);
	   
	   sc.close();
	   

	}

}
