package Ejercicios;

public class cantDecimales {

    public static double decimalFormat(double num, int cant){
        int mult = (int) Math.pow(10 , cant);
        return Math.floor(num * mult) / mult;
    }
    public static void main(String[] args) {

        // Hacer una funcion, donde tenga de parametros
        // un numero con decimales y la cantidad de decimales
        // que quiero regresar

        // ej. funcion(10.23453, 3)
        // >>> 10.234

        double decimal = 10.37523487643822;
        System.out.println(decimalFormat(decimal, 0));

    }
}
