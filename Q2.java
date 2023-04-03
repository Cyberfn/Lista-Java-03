import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int valor = entrada.nextInt();

		if (valor >= 0) {
			System.out.println(valor + " é um número positivo.");
		} 
		else {
			System.out.println(valor + " é um número negativo.");
		}

		entrada.close();
	}
}
