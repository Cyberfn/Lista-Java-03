import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero:");
		int num = entrada.nextInt();

		if (num % 2 == 0) {
			System.out.println("É par");
		}

		else {
			System.out.println("É impar");
		}

		entrada.close();

	}

}
