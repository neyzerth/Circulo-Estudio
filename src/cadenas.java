public class cadenas {
    public static void main(String[] args) { 
        // ------ CODIGOS EN IMPRESIONES
        
        //saltos de linea \n
        System.out.println("\n\nHola\nMundo"); 
        System.out.println("Hola Mun\ndo"); 
        
        //tabulaciones \t
        System.out.println("Hola\t Mundo");
        System.out.println("H\t Mundo");
        System.out.println("Holaaa\t Mundo");

        //imprimir caracteres reservados \\, \"
        System.out.println("Hola \"Mundo\"");   // >>> Hola "Mundo"
        System.out.println("Hola \\Mundo\\");   // >>> Hola \Mundo\

        //Elimina la letra anterior \b
        System.out.println("Hola\b\bMundo");    //>>> HoMundo

        //regresa en la misma linea y sigue escribiendo \r
        //remplaza los caracteres
        System.out.println("12345\rabc");   //>>> abc45
        System.out.print("12345\r");       //>>> abc45
        System.out.print("abc");         //>>> abc45
        

        //----- FUNCIONES EN STRING
        String name = "Polo Monarrez Gutierritos MANUEL OZUNA";
        int age = 18;
        double height = 1.70;

        System.out.println(name.length());              //devuelve un int de la longitud de la cadena

        System.out.println(name.charAt(5));       //devuelve el caracter en la posicion indicada
        System.out.println(name.contains("Lo"));      //devuelve booleano si encuentra cierta cadena especificada

        System.out.println(name.toUpperCase());         //vuelve todo mayusculas
        System.out.println(name.toLowerCase());         //vuelve todo minusuclas

        System.out.println(name.trim());                //elimina espacios del inicio y el final de la cadena

        System.out.println(name.replace("o","A"));  //remplaza todos los caracteres que se indica por otro indicado
        
        String[] ejemplo = name.split(" ");       //devuelve un array, dividiendo la cadena por cierta condicion especificada
        System.out.println(ejemplo[ejemplo.length -1]);
        
        for (int i = 0; i < ejemplo.length; i++) {
             System.out.println(ejemplo[i]);             //Imprime Polo \n Alejandro (array con longitud 2)
        }

        System.out.println("Hola mi nombre es "+name+" y tengo "+age+" años y mido "+height);
        System.out.println(String.format("Hola mi nombre es %s y tengo %d años y mido %f", 
            name, age, height ));  //%s -> String , %d -> int, %f -> double


        //--------- EJERCICIO

        String texto = "Holaaa!";
        System.out.println(texto);

        //Retornar un string por caracter
        // Ej. Hola -> 
        // H
        // o
        // l
        // a
        for(int i = 0; i < texto.length(); i++)
            System.out.println(texto.charAt(i));
        

        
        //Retornar un string al reves
        // Ej. Hola -> aloH
        for(int i = texto.length() -1; i >= 0; i--)
            System.out.print(texto.charAt(i));

        
    }
}
