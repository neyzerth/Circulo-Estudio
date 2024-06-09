package POO;

public class Vehiculo {
    String color;
    String motor;
    String marca;
    int asientos;

    public Vehiculo(String color, String motor, String marca, int asientos){
        this.color = color;
        this.motor = motor;
        this.marca = marca;
        this.asientos = asientos;
    }

    public void arrancar(){
        System.out.println("Brrum brrum");
    }
    public void frenar(){
        System.out.println("Ya frene");
    }
    public void reversa(){
        System.out.println("Pip pip pip");
    }
    public void ponerBachata(){
        System.out.println("Reproduciendo Romeo Santos");
    }
}
