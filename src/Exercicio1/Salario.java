package Exercicio1;
import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario;
		double novoSalario;
		
		
		 salario = sc.nextDouble();

				    if (salario <= 280 ) {
				        novoSalario = salario * 0.20;
				    	System.out.println("Você recebeu Aumento de 20%");
				    }
				    
				    else if (salario <= 700) {
				    	novoSalario = salario * 0.15;
				    	System.out.println("Você recebeu aumento de 15%");
				    }
				    
				    else if (salario <= 1500) {
				    	novoSalario = salario * 0.10;
				    	System.out.println("Você recebeu aumento de 10%");
				    }
				   
				    
				    else {
				    	System.out.println("Você recebeu aumento de 5%");
				    }
				    
				    
				 
	}
}

