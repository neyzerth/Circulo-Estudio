package Ejercicios.Polo;
import java.util.Scanner;
public class Polo {
    public static Scanner scanner = new Scanner(System.in);
    
    public static double regresarDecimales(double numero, int cantidad){
        double pot = Math.pow(10, cantidad );
        return (Math.floor(numero*pot)/pot);
    }

    public static void main(String[] args) {

        System.out.println(regresarDecimales(8.3242343254215, 3));
        /*
        // Hacer un programa que convierta una estatura de centimetros a metros
        int heightCm = 172; // Convertir a double
        // Convertir a metros: 1 metro = 100
        double heightM = (double) heightCm / 100;
        System.out.println("Yo mido " + heightCm + "cm");
        System.out.println("O tambien " + heightM + "m");
        */

        //Imprimir cualquier valor con decimal con solo 2 decimales
       // double decimal = 8.343234; 
        //System.out.println(Math.floor(decimal*100)/100);



        //Hacer una funcion, donde tenga prarametro
        // un numero con decimales y la cantidad de decimales que quiero regresar

        //ej. funcion(10.23453, 2)
        //>>> 10.234
    //     double numero;
    //     int cantidad; 

    //     System.out.println("Ingresa un numero");
    //     numero = scanner.nextDouble();
    //     System.out.println("Ingresa la cantidad a recorrer: ");
    //     cantidad = scanner.nextInt();
    //     System.out.println(regresarDecimales(numero,cantidad));
     }
}
