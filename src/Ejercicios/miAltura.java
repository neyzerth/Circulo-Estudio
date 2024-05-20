package Ejercicios;

public class miAltura {
    public static void main(String[] args) {
        
        // Hacer un programa que convierta una estatura de centimetros a metros
        int heightCm = 193;

        // 1 m = 100 cm
        //m = cm/100
        double heightM = (double) heightCm / 100;


        System.out.println("Yo mido " + heightCm + "cm");
        System.out.println("O tambien " + heightM + "m");
        
    }
}
