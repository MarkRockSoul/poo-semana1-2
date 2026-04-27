import java.util.Random;
import java.util.Scanner;

public class RetoClase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.println("Ingresa tu nota: ");
        double nota = sc.nextDouble();

        System.out.println("Nombre: " + nombre + " tu edad es: " + edad + " y tu nota es: " + nota);
        sc.close();

        if (Math.round(nota) >= 12) {
            System.out.println("Aprobo");
        } else if (nota >= 5 || nota <= 10) {
            System.out.println("En recuperacion");
        } else {
            System.out.println("Desaprobado");
        }

        String mayusculas = nombre.toUpperCase();
        System.out.println("Nombre en mayusculas: " + mayusculas);

        int matricula = rnd.nextInt(10000, 100000);
        System.out.println("Numero de matricula: " + matricula);

        int años = Math.abs(65 - edad);
        System.out.println("Te faltan " + años + " años para jubilarte");
    }

}
