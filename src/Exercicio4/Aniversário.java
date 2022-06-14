package Exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Aniversário {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int dia, mes;
		double ano;

		System.out.println("Digite o dia do seu aniversário: ");
		dia = sc.nextInt();

		System.out.println("Digite o mês de Nascimento");
		mes = sc.nextInt();

		System.out.println("Digite o ano de Nascimento");
		ano = sc.nextDouble();

		if (mes > ano) {
			System.out.println("Data Inválida");
		}

		else {
			System.out.println("Data Válida, você digitou mês ou dia inválido");
		}
		sc.close();
	} 
}
