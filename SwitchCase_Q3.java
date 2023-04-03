import java.util.Scanner;

public class SwitchCase_Q3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		char letra = entrada.next().charAt(0);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E'
				|| letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println(letra + " é uma vogal.");
		} else {
			System.out.println(letra + " não é uma vogal.");
		}

		entrada.close();

	}
}
