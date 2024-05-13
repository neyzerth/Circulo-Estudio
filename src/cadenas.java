public class cadenas {
    public static void main(String[] args) { 
        // ------ CODIGOS EN IMPRESIONES
        
        //saltos de linea
        String salto = "\n";
        System.out.println("Hola\nMundo"); 
        System.out.println("Hola\n\n\nMundo"); 

        //tabulaciones
        System.out.println("Hola\t Mundo");
        System.out.println("H\t Mundo");
        System.out.println("Holaaa\t Mundo");

        //imprimir caracteres reservados
        System.out.println("Hola \"Mundo\"");   // >>> Hola "Mundo"
        System.out.println("Hola \\Mundo\\");   // >>> Hola \Mundo\

        //Elimina la letra anterior
        System.out.println("Hola\b\bMundo");    //>>> HoMundo

        //regresa en la misma linea y sigue escribiendo
        //remplaza los caracteres
        System.out.println("12345\rabc");   //>>> abc45
        

        //----- FUNCIONES EN STRING
        String name = "Polo Alejandro";

        System.out.println(name.length());              //devuelve un int de la longitud de la cadena
        System.out.println(name.charAt(4));       //devuelve el caracter en la posicion indicada
        System.out.println(name.contains("lo"));      //devuelve booleano si encuentra cierta cadena especificada
        System.out.println(name.toUpperCase());         //vuelve todo mayusculas
        System.out.println(name.toLowerCase());         //vuelve todo minusuclas
        System.out.println(name.trim());                //elimina espacios del inicio y el final de la cadena
        System.out.println(name.replace("o","A"));  //remplaza todos los caracteres que se indica por otro indicado
        
        String[] ejemplo = name.split(" ");       //devuelve un array, dividiendo la cadena por cierta condicion especificada
        for (int i = 0; i < ejemplo.length; i++) {
            System.out.println(ejemplo[i]);             //Imprime Polo \n Alejandro (array con longitud 2)
        }

        System.out.println(String.format("Hola mi nombre es %s y tengo %d años y mido %f", //otra forma de imprimir
            name, 18, 1.70 ));  //%s -> String , %d -> int, %f -> double


        //--------- EJERCICIO

        String texto = "Hola!";

        //Retornar un string por caracter
        // Ej. Hola -> 
        // H
        // o
        // l
        // a

        System.out.println(texto);
        for (int i =0 ; i <  texto.length() ; i++) {
            System.out.println(texto.charAt(i));
            
        }
        //Retornar un string al reves
        // Ej. Hola -> aloH


        System.out.println(texto);
        for (int i = texto.length()-1; i >= 0 ; i--) {
            System.out.print(texto.charAt(i));
            
        }
    }
}
