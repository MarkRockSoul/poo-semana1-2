public class CuentaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double _saldo) {
        if (_saldo >= 0) {
            this.saldo = _saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

}
