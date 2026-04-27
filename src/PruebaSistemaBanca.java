import Clases.CuentaBancaria;

public class PruebaSistemaBanca {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(1000.50);
        double saldoActual = cuenta.getSaldo();
        System.out.println("Saldo de la cuenta: " + saldoActual);
    }
}
