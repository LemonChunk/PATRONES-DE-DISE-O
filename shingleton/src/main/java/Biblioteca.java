/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SalaUpro
 */
import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Libro>libros;
    private static Biblioteca unicaInstancia;
    private Biblioteca(){
        this.libros= new ArrayList();
    }
    public static Biblioteca getUnicaInstancia() {
        if(Biblioteca.unicaInstancia==null){
            Biblioteca.unicaInstancia=new Biblioteca();
        }
        return Biblioteca.unicaInstancia;
    }
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
