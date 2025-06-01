package lista08_JAVA;

import java.util.Scanner;

public class E10_SenhaCorreta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String senhaCorreta = "java123";
		String senhaDigitada;

		System.out.print("Digite a senha: ");
		senhaDigitada = sc.nextLine();

		while (!senhaDigitada.equals(senhaCorreta)) {
			System.out.println("Senha incorreta. Tente novamente.");
			System.out.print("Digite a senha: ");
			senhaDigitada = sc.nextLine();
		}

		System.out.println("Acesso concedido!");

		sc.close();
	}
}
