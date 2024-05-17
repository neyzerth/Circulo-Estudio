package Codigos;

import java.util.Random;

//Manipular valores numericos y conversiones
public class numericos {
    public static void main(String[] args) {
        // Generar numeros al azar
        System.out.println("Numeros al azar");
        // MANERA 1 - crear instancia Random
        Random random = new Random();
        System.out.println(random.nextInt(50) + 1);

        // MANERA 2 - Usar funcion de Math
        // Imprime un numero al azar de 0.0 a 1.0, y se multiplica
        // por el limite de numeros random (devuelve un double)
        System.out.println((int) (Math.random() * 50) + 1);

        System.out.println("\nFunciones matematicas");
        System.out.println("pow(a,b)\t" + Math.pow(5, 2)); // potencia a^b
        System.out.println("sqr(a)\t"   + Math.sqrt(25));   // raiz cuadrada de un numero
        System.out.println("abs(a)\t"   + Math.abs(-25));   // retorna solo valor absoluto (positivo)

        System.out.println("\nFunciones de redondeo");
        System.out.println("floor(a)\t" + Math.floor(2.3423432243432432)); // retorna solo el valor mas bajo (2.0)
        System.out.println("round(a)\t" + Math.round(4.5)); // redondeaal valor mas cercano
        System.out.println("ceil(a)\t"  + Math.ceil(10.1)); // retorna el valor mas arriba (11.0)

        System.out.println("\nFunciones de comparacion");
        System.out.println("max(a,b)\t" + Math.max(10, 20)); // regresa el valor mayor entre a y b
        System.out.println("min(a,b)\t" + Math.min(10, 20)); // regresa el valor menor entre a y b


        // ----------- C O N V E R S I O N E S -------------------------------
        System.out.println("\nCONVERSIONES \n");

        // -----------VALORES STRING -------------------------------
        System.out.println("\nValores String");
        String str;

        // Char
        str = "" + 'a';
        System.out.println("char ->\t" + str);

        // Numericos
        str = String.valueOf(6.6);
        System.out.println("numericos ->\t" + str);

        // Booleanos
        str = String.valueOf(true);
        System.out.println("booleanos ->\t" + str);



        // ---------VALORES INT -------------------------------
        System.out.println("\nValores int");
        int intNum;

        // double, float
        intNum = (int) 2.2;
        System.out.println("real  ->\t"+intNum);

        // String
        intNum = Integer.parseInt("2");
        System.out.println("String ->\t"+intNum);

        // char
        intNum = Character.getNumericValue('3');
        System.out.println("char 1 ->\t"+intNum);
        
        intNum = '2' - '0';
        System.out.println("char 2 ->\t"+intNum);



        // --------VALORES DOUBLE -------------------------------
        System.out.println("\nValores Double");
        double doubNum;

        // int
        doubNum = (double) 10;
        System.out.println("int ->\t"+doubNum);

        // String
        doubNum = Double.parseDouble("34.6");
        System.out.println("String ->\t"+doubNum);

        // char
        doubNum = Character.getNumericValue('8');
        System.out.println("char ->\t"+doubNum);



        // --------VALORES BOOLEAN -------------------------------
        System.out.println("\nValores Boolean");
        boolean bool;

        // String
        bool = Boolean.parseBoolean("true");
        System.out.println("\"true\" ->\t"+bool);

        bool = Boolean.parseBoolean("false");
        System.out.println("\"false\" ->\t"+bool);

        bool = Boolean.parseBoolean("TRUE");
        System.out.println("\"TRUE\" ->\t"+bool);

        bool = Boolean.parseBoolean("culquier otro texto nada q ver");
        System.out.println("\"Otro\" ->\t"+bool);

        System.out.println();
    }
}
