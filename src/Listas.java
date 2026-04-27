import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {
		ArrayList<String> dias = new ArrayList<>();

		dias.add("Lunes");
		dias.add("Martes");
		dias.add("Miércoles");

		for (String dia : dias) {
			System.out.println("Día: " + dia);
		}
	}
}
