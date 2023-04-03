import java.util.Scanner;

public class SwitchCase_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Selecione o turno que estuda:");
		System.out.println("M - Matutino");
		System.out.println("V - Vespertino");
		System.out.println("N - Noturno");
		String turno = entrada.next();

		if (turno.equalsIgnoreCase("M")) {
			System.out.println("Bom Dia!");
		} else if (turno.equalsIgnoreCase("V")) {
			System.out.println("Boa Tarde!");
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Valor Inválido!");
		}

		entrada.close();

	}

}
