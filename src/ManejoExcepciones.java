public class ManejoExcepciones {

	public static void main(String[] args) {
		int[] numeros = new int[3];

		try {
			System.out.println(numeros[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Índice fuera de los límites del arreglo.");
		}

		System.out.println("Programa continuando después del manejo de la excepción.");
	}
}
