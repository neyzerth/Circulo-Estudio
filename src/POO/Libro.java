package POO;
//CREAR UN OBJETO LIBRO PARA UNA LIBRERIA
//DONDE SE QUIERE LLEVAR EL REGISTRO DEL NOMBRE, AUTOR, CATALOGO
//Y CONTROLAR LAS EXISTENCIAS DE CADA LIBRO, DONDE PUEDA AUMENTAR
//SUS EXISTENCIAS O DISMINUIRLAS CUANDO COMPRAN
public class Libro {
    String nombre;
    String autor;
    String catalogo;
    int existencias;

    public Libro(String nombre, String autor, String catalogo, int existencias){
        this.nombre = nombre;
        this.autor = autor;
        this.catalogo = catalogo;
        this.existencias = existencias;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "\nautor: " + autor + "\ncatalogo: "+catalogo+"\nexistencias: "+existencias;
    }

    public void agregarExistencias(int newLibro){
        this.existencias += newLibro;
    }
    public void comprarLibro(int cantCompra){
        this.existencias -= cantCompra;
    }
}
