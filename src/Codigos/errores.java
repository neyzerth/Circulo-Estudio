package Codigos;
import java.util.Scanner;

public class errores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0;

        System.out.print("Ingresa un numero: ");
        try {
            num = input.nextInt();
            System.out.println("Tu numero es "+num);
            
        } catch (Exception e) {
            System.out.println("Solo valores enteros");
        }
        input.close();

    }
}
