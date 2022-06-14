package Exercicio2;
import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float nota1, nota2, nota3, media;

		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextFloat();

		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextFloat();

		System.out.println("Digite a terceira nota: ");
		nota3 = entrada.nextFloat();

		media = ((nota1 * 2) + (nota2 * 2) + (nota3 * 2));

		System.out.printf("A media do aluno e: %.2f%n", media);

	}
		
}