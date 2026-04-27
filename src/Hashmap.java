import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String, String> capitales = new HashMap<>();

		capitales.put("España", "Madrid");
		capitales.put("Francia", "París");
		capitales.put("Italia", "Roma");

		for (String pais : capitales.keySet()) {
			System.out.println("La capital de " + pais + " es " + capitales.get(pais));
		}
	}
}
