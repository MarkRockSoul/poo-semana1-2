import java.util.Random;
import java.lang.Math;

public class EjemploRandomMath {
    public static void main(String[] args) {

        Random rnd = new Random();

        int n = rnd.nextInt(51);
        System.out.println("Numero aleatorio: " + n);

        double d = rnd.nextDouble(); // aleatorio entre 0 y 1
        System.out.println("Numero decimal aleatorio: " + d);

        boolean b = rnd.nextBoolean();
        System.out.println("Boleano aleatorio: " + b);

        // Potencia
        double valor = Math.pow(2, 3);
        System.out.println("2 al 3: " + valor);

        // Raiz cuadrada
        valor = Math.sqrt(144);
        System.out.println("Raiz de 144: " + valor);

        // Redondear up
        double redondeoU = Math.ceil(8.4);
        System.out.println("8.4 redondeado Up: " + redondeoU);

        // Redondear comun
        long redondeoC = Math.round(8.4);
        System.out.println("8.4 redondeado comun: " + redondeoC);

        // Redondear down
        double redondeoD = Math.floor(8.4);
        System.out.println("8.4 redondeado down: " + redondeoD);

        // Constantes
        System.out.println("PI: " + Math.PI);
        System.out.println("Numero de Euler: " + Math.E);
    }
}
