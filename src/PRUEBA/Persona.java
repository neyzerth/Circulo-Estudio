package PRUEBA;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private int altura;
    private float peso;
    private String rfc;

    public Persona() {
    }

    public Persona(String nombre, int edad, int altura, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        setRfc();
    }

    public Persona(String nombre, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = (float) peso;
        setRfc();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad){
        if(edad < 0 ){
            System.err.println("Debe ingresar edad valida");
            return;
        }
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getRfc() {
        return this.rfc;
    }

    private void setRfc() {
        this.rfc = nombre.toUpperCase() + edad + generarClave();
    }
    private String generarClave(){
        Random random = new Random();
        String clave = "";
        for(int i = 0; i < 3; i++){
            clave += (char) (random.nextInt(25) + 66);
        }
        return clave;
    }

    

}

class test{
    public static void main(String[] args) {
        Persona luis = new Persona("Luis", 18, 182, 65.7);
        System.out.println(luis.getRfc());
    }
}

