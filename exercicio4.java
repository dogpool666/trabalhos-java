
package exercicio;

import java.util.Scanner;

public class exercicioltp {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Digite o tempo de casa em anos: ");
        int tempoDeCasa = scanner.nextInt();      
        System.out.print("Digite o salário do empregado: ");
        double salario = scanner.nextDouble();
        
        double bonus = 0;
        double valeTransporte = 0;
        
        if (tempoDeCasa <= 5) {
            if (salario <= 300) {
                bonus = 50;
                valeTransporte = salario * 0.05;
            } 
            else {
                bonus = 80;
                valeTransporte = salario * 0.06;
            }
        } 
        else if (tempoDeCasa >= 6 && tempoDeCasa <= 10) {
            if (salario <= 500) {
                bonus = salario * 0.15;
                valeTransporte = 70;
            } 
            else if (salario > 500 && salario <= 2000) {
                bonus = salario * 0.13;
                valeTransporte = 90;
            } 
            else {
                bonus = salario * 0.12;
                valeTransporte = salario * 0.08;
            }
        } 
        	else { 
            bonus = 300;
            valeTransporte = salario * 0.04;
        }
        
        
        System.out.printf("Bônus Salarial: R$ "+ bonus+ "\n");
        System.out.printf("Desconto de Vale Transporte: R$ "+ valeTransporte+ "\n");
        
        scanner.close();
    }
}
