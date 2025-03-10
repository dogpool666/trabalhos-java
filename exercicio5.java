package exercicio;

import java.util.Scanner;

public class exercicio2 {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double peso;
		double altura;
		double imc;
		char sexo;

		Scanner leia;
		leia = new Scanner(System.in);
		System.out.print("digite o sexo (M/F) ");
		sexo=leia.next().charAt(0);
		System.out.print("digite o peso ");
		peso=leia.nextDouble();
		System.out.print("digite a altura ");
		altura=leia.nextDouble();
		
		
		imc = peso / Math.pow(altura, 2);
		System.out.print("seu imc é "+imc+"\n");
		if (imc<=19.1 && sexo == 'F') {	
			System.out.print("Abaixo do peso");
			} else if(imc>19.1 && imc<25.8 && sexo == 'F'){
				System.out.print("peso ideal");					
			}else if (imc>25.8 && imc<27.3 && sexo == 'F'){
				System.out.print("pouco acima do peso");
			}else if (imc>27.3 && imc<32.3 && sexo == 'F'){
				System.out.print("acima do peso");
			}else if(imc>32.3 && sexo == 'F'){				
			System.out.print("obeso");}
		
		if (imc<=20.7 && sexo == 'M') {	
			System.out.print("Abaixo do peso");
			} else if(imc>20.7 && imc<26.4 && sexo == 'M'){
				System.out.print("peso ideal");					
			}else if (imc>26.4 && imc<27.8 && sexo == 'M'){
				System.out.print("pouco acima do peso");
			}else if (imc>27.8 && imc<31.1 && sexo == 'M'){
				System.out.print("acima do peso");
			}else if(imc>31.1 && sexo == 'M'){				
				System.out.print("obeso");}
				
				
	}

}
