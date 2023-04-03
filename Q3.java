import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int numero1 = entrada.nextInt();

		System.out.print("Digite o segundo número: ");
		int numero2 = entrada.nextInt();

		int soma = numero1 + numero2;

		if (soma > 20) {
			soma += 8;
			System.out.println("A soma é " + soma);
		} 
		else {
			soma -= 5;
			System.out.println("A soma é " + soma);
			}
		entrada.close();
	}
}
