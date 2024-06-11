package PRUEBA;

public class CuentaBancaria {
    private int numCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria() {};

    public CuentaBancaria(int numCuenta, String titular, double saldo) {
        setNumCuenta(numCuenta);
        setTitular(titular);
        setSaldo(saldo);
    }

    public void Depositar(double deposito) {
        if (deposito > 0)
            this.saldo += deposito;
        else
            System.out.println("SOLO CANTIDADES MAYORES A 0");
    }

    public void Retirar(double retiro) {
        if(retiro > 0 && retiro <= this.saldo)
            this.saldo -= retiro;
        else
            System.out.println("INGRESA UN RETIRO VALIDO");
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0)
            this.saldo = saldo;
    }

    public int getNumCuenta() {
        return this.numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        if (numCuenta > 0)
            this.numCuenta = numCuenta;
        else
            System.out.println("NUMERO NO VALIDO");
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        if(!titular.isEmpty())
            this.titular = titular;
        else
            System.out.println("NO PUEDE ESTAR VACIO");
    }

    @Override
    public String toString() {
        return "{" +
            " numCuenta='" + getNumCuenta() + "'" +
            ", titular='" + getTitular() + "'" +
            ", saldo='" + getSaldo() + "'" +
            "}";
    }
}