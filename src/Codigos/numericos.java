package Codigos;

import java.util.Random;

//Manipular valores numericos y conversiones
public class numericos {
    public static void main(String[] args) {
        // Generar numeros al azar
        System.out.println("Numeros al azar");

        // MANERA 1 - crear instancia Random
        Random azar1 = new Random();

        System.out.print("Random 1: " + (azar1.nextInt(50) + 1));

        // MANERA 2 - Usar funcion de Math
        // Imprime un numero al azar de 0.0 a 1.0, y se multiplica
        // por el limite de numeros random (devuelve un double)
        int azar2 = (int) (Math.random() * 50)+1;

        System.out.print("\nRandom 2: " + azar2);

        //Funciones matematicas con Math
        System.out.println("\nFunciones matematicas");
        System.out.println("pow(a,b)\t"  + Math.pow(5, 3)); // potencia a^b
        System.out.println("sqrt(a)\t\t" + Math.sqrt(25));   // raiz cuadrada de un numero
        System.out.println("abs(a)\t\t"  + Math.abs(-3));  // retorna solo valor absoluto (positivo)

        System.out.println("\nFunciones de redondeo");
        System.out.println("floor(a)\t"  + Math.floor(10.9)); // retorna solo el valor mas bajo (2.0)
        System.out.println("round(a)\t"  + Math.round(8.6)); // redondea al valor mas cercano
        System.out.println("ceil(a)\t\t" + Math.ceil(10.001)); // retorna el valor mas arriba (11.0)

        System.out.println("\nFunciones de comparacion");
        System.out.println("max(a,b)\t" + Math.max(10,20)); // regresa el valor mayor entre a y b
        System.out.println("min(a,b)\t" + Math.min(10,20)); // regresa el valor menor entre a y b

        // ----------- C O N V E R S I O N E S -------------------------------
        System.out.println("\nCONVERSIONES \n");

        // -----------VALORES STRING -------------------------------
        System.out.println("\nValores String");
        String str;

        // Char
        str = ""+'a';
        System.out.println("char ->\t" + str);

        // Numericos
        str = String.valueOf(4.01f);
        System.out.println("numericos ->\t" + str);

        // Booleanos
        str = String.valueOf(true);
        System.out.println("booleanos ->\t" + str);



        // ---------VALORES INT -------------------------------
        System.out.println("\nValores int");
        int intNum;

        // double, float
        intNum = (int) 2.1;
        System.out.println("real  ->\t"+intNum);

        // String
        intNum = Integer.parseInt("4");
        System.out.println("String ->\t"+intNum);

        // char
        System.out.println("char ->\t"+intNum);



        // --------VALORES DOUBLE -------------------------------
        System.out.println("\nValores Double");
        double doubNum = 0;

        // int
        System.out.println("int ->\t"+doubNum);

        // String
        System.out.println("String ->\t"+doubNum);

        // char
        System.out.println("char ->\t"+doubNum);


        // --------VALORES BOOLEAN -------------------------------
        System.out.println("\nValores Boolean");
        boolean bool = true ;

        // String
        System.out.println("\"true\" ->\t"+bool);
        
        System.out.println("\"false\" ->\t"+bool);

        System.out.println("\"TRUE\" ->\t"+bool);

        System.out.println("\"Otro\" ->\t"+bool);

        System.out.println();
    }
}
