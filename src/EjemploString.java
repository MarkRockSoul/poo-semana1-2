public class EjemploString {
    public static void main(String[] arg) {

        int cantidad = "Marco".length();
        System.out.println(cantidad);

        String mayusculas = "marco".toUpperCase();
        System.out.println(mayusculas);

        String minusculas = "MARCO".toLowerCase();
        System.out.println(minusculas);

        String tmp = mayusculas.substring(0, 3);
        System.out.println(tmp);

        boolean contiene = "marco".contains("ar");
        System.out.println(contiene);

        String nuevoNombre = mayusculas.replace("CO", "IA");
        System.out.println(nuevoNombre);

        String trim = "       marco antonio     ".trim();
        System.out.println(trim);

        boolean esIgual = minusculas.equals("marco");
        System.out.println(esIgual);
    }
}
