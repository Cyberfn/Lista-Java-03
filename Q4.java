import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = entrada.nextInt();

		if (num % 3 == 0) {
			System.out.println("É múltiplo de 3");
		} else {
			System.out.println("Não é múltiplo de 3");
		}

		entrada.close();

	}

}
