package POO;

import java.util.Scanner;

public class CuentaBancaria {
    private String numCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria() {
        this.numCuenta = "000";
        this.titular = "Desconocido";
        this.saldo = 0;
    }

    public CuentaBancaria(String numCuenta, String titular, double saldo) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        setSaldo(saldo);
    }

    public void Depositar(double deposito) {
        if (deposito > 0)
            this.saldo += deposito;
        else
            System.err.println("NUMERO NO VALIDO");
    }

    public void Retirar(double retiro) {
        if (retiro > 0 && retiro <= this.saldo)
            this.saldo -= retiro;
        else
            System.err.println("NUMERO NO VALIDO");
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNumCuenta() {
        return this.numCuenta;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getFormatSaldo() {
        return "$" + this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0)
            this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "{" +
            " numCuenta='" + getNumCuenta() + "'" +
            ", titular='" + getTitular() + "'" +
            ", saldo='$" + getSaldo() + "'" +
            "}";
    }


}

class Test {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        CuentaBancaria cuenta = new CuentaBancaria("012", "Luis Fernando", 100);
        int opt;
        do {
            System.out.println();
            System.out.println("BANCO PERMATRAGO\n");
            System.out.println("[1] Informacion de la cuenta");
            System.out.println("[2] Consultar saldo");
            System.out.println("[3] Depositar");
            System.out.println("[4] Retirar");
            System.out.print(">");
            opt = leer.nextInt();

            switch (opt) {
            
                case 1:
                    System.out.println(cuenta.toString());

                    break;
                case 2:
                    System.out.println(cuenta.getFormatSaldo());
                    break;
                case 3:
                    System.out.print("Ingrese saldo a depositar\n> $");
                    double deposito = leer.nextDouble();
                    cuenta.Depositar(deposito);
                    break;
                case 4:
                    System.out.print("Ingrese saldo a depositar\n> $");
                    double retiro = leer.nextDouble();
                    cuenta.Retirar(retiro);
                    break;
            
                default:
                    break;
            }
        } while (true);
    }
}
