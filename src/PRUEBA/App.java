package PRUEBA;

public class App {
    public static void main(String[] args) {
        //INSTANCIAS
        //Tipo de dato + nombre = new Constructor();
        Vehiculo makuin = new Vehiculo("rayo", "rojo", "95", 5);
        Vehiculo vagoneta = new Vehiculo(
            "redstone", 
            "gris", 
            "mojang", 
            1
        );

        System.out.println(makuin.motor);
        System.out.println(vagoneta.motor);
        
        makuin.motor = "popo";
        System.out.println(makuin.motor);

        makuin.reversa();
        vagoneta.ponerBachata();
    }
}
