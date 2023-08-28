/*6) Solicite um valor do teclado e exiba a divisao*/

package exercicio;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
       System.out.println("Digite um número que deseja dividir");
       
       float numero1=sc.nextFloat();
       
       System.out.println("Digite outro numero que deseja dividir");
       
       float numero2=sc.nextFloat();
       float divisao=numero1/numero2;
       
       System.out.println("A divisão dos valores é: " +divisao);
       
       sc.close();
		
	}

}
