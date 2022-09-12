/*Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e escrever a área do losango*/

package exercicio;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);		

      System.out.println("Digite a diagonal maior do losango");
	
      float diagonalmaior=sc.nextFloat();
      
      System.out.println("Digite a diagonal menor do losango");
	
      float diagonalmenor=sc.nextFloat();
      float area=diagonalmaior*diagonalmenor/2;
      
      System.out.println("O valor da area do losango é: " +area);
    		  
     sc.close();
      
	}
	

}
