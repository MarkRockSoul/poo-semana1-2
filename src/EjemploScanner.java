import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa tu nota: ");
        double nota = sc.nextDouble();

        System.out.print("Nombre: " + nombre + " tu nota es: " + nota);
        sc.close();

    }
}