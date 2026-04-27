public class EjecutarPrueba {
	public static void main(String[] args) {
		Contador.contar();
		Contador.contar(100);
		System.out.println("Total: " + Contador.getTotal());
	}
}
