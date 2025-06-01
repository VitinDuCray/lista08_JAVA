package lista08_JAVA;

import java.util.Scanner;

public class E04_TabuadaDeX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para ver a tabuada: ");
		int numero = sc.nextInt();

		int i = 1;

		while (i <= 10) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
			i++;
		}

		sc.close();
	}
}
