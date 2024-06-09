package POO;

public class App {
    public static void main(String[] args) {
        Vehiculo makuin = new Vehiculo("rojo", "rayo", "95", 5);
        Vehiculo vagoneta = new Vehiculo("gris","redstone", "mojang", 1);

        System.out.println(makuin.motor);
        System.out.println(vagoneta.motor);
        
        makuin.motor = "gasolina";
        vagoneta.motor = "paja";
        System.out.println(makuin.motor);
        System.out.println(vagoneta.motor);

        makuin.arrancar();
        vagoneta.ponerBachata();
        
        //CREAR UN OBJETO LIBRO PARA UNA LIBRERIA
        //DONDE SE QUIERE LLEVAR EL REGISTRO DEL NOMBRE, AUTOR, CATALOGO
        //Y CONTROLAR LAS EXISTENCIAS DE CADA LIBRO, DONDE PUEDA AUMENTAR
        //SUS EXISTENCIAS O DISMINUIRLAS CUANDO COMPRAN

        Libro crepusculo = new Libro("Crepusculo", "Stefany", "Romance", 15);
        Libro biblia = new Libro(
            "La Santa Bilbia",
            "Diosito",
            "Religion", 
            1000
        );

        System.out.println(crepusculo);
        System.out.println();
        System.out.println(biblia);

        crepusculo.agregarExistencias(5);
        System.out.println(crepusculo.existencias);

        biblia.comprarLibro(100);
        System.out.println(biblia.existencias);
    }   //Scanner leer = new Scanner(System.in);
}
