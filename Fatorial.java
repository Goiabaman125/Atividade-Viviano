public class Principall {

	public static void main(String[] args) {

		int numero;
		long fatorial;

		System.out.printIn("Escreva um numero para calcular o fatorial");
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= numero; i++) {
			fatorial = fatorial * i;
		}

		System.out.printIn("O Fatorial de" + numero + "é:" + fatorial);
	}

}