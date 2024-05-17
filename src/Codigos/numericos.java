package Codigos;
import java.util.Random;

public class numericos {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(100)+1);
        System.out.println(Math.random()*100);
          

        System.out.println("Funciones matematicas");
        System.out.println(Math.pow(5,2));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.abs(-25));

        System.out.println("Funciones redondeo");
        System.out.println(Math.floor(2.3423432243432432));
        System.out.println(Math.round(2.5));
        System.out.println(Math.ceil(10.1));

        System.out.println("Funciones de comparacion");
        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));

        System.out.println("CONVERSIONES \n");
        //-----------VALORES STRING
        System.out.println("String");
        String str;
        
        //Char
        str = ""+'a';
        System.out.println(str);
         //Numericos
        str = String.valueOf(6.6);
         //Booleanos
         str = String.valueOf(true);

         //---------VALORES INT
        System.out.println("int");
        int intNum;

        //double, float
        intNum = (int) 2.2;
        System.out.println(intNum);
        //String
        intNum = Integer.parseInt("Pepito");
        System.out.println(intNum);
        //char
        intNum = '2'-'0';
        System.out.println(intNum);

        //--------VALORES DOUBLE
        System.out.println("Double");
        double doubNum;
        //int
        doubNum = (double) 10;
        //String
        doubNum = Double.parseDouble("34.6");
        System.out.println(doubNum);
        //char

        //System.out.println("Double");

        boolean bool;
        //String

        //Hacer un programa que convierta una estatura de centimetros a metros
        int heightCm = 172;
        double heightM = 0;

        System.out.println("Yo mido "+heightCm+"cm");
        System.out.println("O tambien "+heightM+"M");

        //Imprimir cualquier valor con decimal con solo 2 decimales
        double decimal = 8.22946; 

        

    }
}
