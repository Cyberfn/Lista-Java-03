import java.util.Scanner;

public class SwitchCase_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Selecione o sexo desejado:");
		System.out.println("M - Masculino");
		System.out.println("F - Feminino");
		String sexo = entrada.next();

		if (sexo.equalsIgnoreCase("M")) {
			System.out.println("M - Masculino");
		} else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
		} else {
			System.out.println("Sexo Inválido");
		}

		entrada.close();

	}

}
