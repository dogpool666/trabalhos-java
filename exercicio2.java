package exercicio;

import java.util.Scanner;

public class exercicio2 {


	public static void main(String[] args) {
		double salario;
		double cheq1;
		double cheq2;
		double desc1;
		double desc2;
		double total;

		Scanner leia;
		leia = new Scanner(System.in);
		System.out.print("digite o valor do salario: R$");
		salario=leia.nextFloat();
		
		System.out.print("digite o valor do primeiro cheque: R$");
		cheq1=leia.nextFloat();
		System.out.print("digite o val do segundo cheque: R$");
		cheq2=leia.nextFloat();
		  
		desc1=cheq1*0.0002+cheq1;
		desc2=cheq2*0.0002+cheq2;
		
		
				System.out.print( "o primeiro cheque é: R$"+desc1+"\n");
				
				System.out.print( "o segundo cheque é: R$" +desc2+"\n");
				
		total=desc1+desc2;
		salario=salario-total;
				
				System.out.print( "o debito é: R$"+salario+ "\n");
				
	}

}
