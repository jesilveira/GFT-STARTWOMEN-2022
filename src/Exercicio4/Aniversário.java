package Exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Anivers�rio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int dia, mes;
		double ano;

		System.out.println("Digite o dia do seu anivers�rio: ");
		dia = sc.nextInt();

		System.out.println("Digite o m�s de Nascimento");
		mes = sc.nextInt();

		System.out.println("Digite o ano de Nascimento");
		ano = sc.nextDouble();

		if (mes > ano) {
			System.out.println("Data Inv�lida");
		}

		else {
			System.out.println("Data V�lida, voc� digitou m�s ou dia inv�lido");
		}
		sc.close();
	} 
}
