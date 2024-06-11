package PRUEBA;

import java.util.Scanner;

public class Encapsulamiento {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(
            2,
            "Luis",
            100
        );
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("BANCO PERMTRAGO");
            System.out.println(
                    "[1] Informacion de la cuenta" +
                            "[2] Saldo" +
                            "[3] Depositar" +
                            "[4] Retirar");
            System.out.print("> ");
            int opt = leer.nextInt();

            switch (opt) {
                case 1:
                    System.out.println(cuenta1.toString());
                    break;

                case 2:
                    System.out.println("Su saldo es de $" + cuenta1.getSaldo());
                    break;
                    
                case 3:
                    System.out.print("Ingresa cantidad a depositar:\n> ");
                    int deposito = leer.nextInt();

                    cuenta1.Depositar(deposito);

                    System.out.println("$"+cuenta1.getSaldo());
                    break;

                case 4:
                    System.out.print("Ingresa cantidad a retirar:\n> ");
                    int retiro = leer.nextInt();

                    cuenta1.Retirar(retiro);

                    System.out.println("$"+cuenta1.getSaldo());
                    break;

                default:
                    break;
            }
        } while (true);

    }
}
