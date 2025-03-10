package exercicio;

import java.util.Scanner;

public class exercicioltp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		double lado1;
		double lado2;
		double lado3;
			
		Scanner leia;
		leia = new Scanner(System.in);
		
		System.out.print("digite a medida do 1 um lado ");
		lado1=leia.nextDouble();
		System.out.print("digite a medida do 2 lado ");
		lado2=leia.nextDouble();
		System.out.print("digite a medida do 3 lado  ");
		lado3=leia.nextDouble();
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.print("o triangulo é equilatero ");
		}
		else if(lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1){
			System.out.print("não é um triângulo.  ");
		}
		 else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	            System.out.println("triângulo é isósceles.");
	        }
		 else {
			 System.out.println("o triângulo é escaleno");
		 }
	}
}
