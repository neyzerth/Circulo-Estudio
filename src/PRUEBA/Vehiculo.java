package PRUEBA;

//OBJETO
public class Vehiculo {
    //ATRIBUTOS
    String motor;
    String color;
    String modelo;
    int asientos;

    //METODOS
    //Constructor
    public Vehiculo(String motor, String color, String modelo, int asientos){
        this.motor = motor;
        this.color = color;
        this.modelo = modelo;
        this.asientos = asientos;
    }

    public void arrancar(){
        System.out.println("Brum brrum");
    }
    public void frenar(){
        System.out.println("Estoy frenando");
    }
    public void reversa(){
        System.out.println("Pip, pip, pip");
    }
    public void ponerBachata() {
        System.out.println("Reproduciendo Romeo Santos");
    }
}
