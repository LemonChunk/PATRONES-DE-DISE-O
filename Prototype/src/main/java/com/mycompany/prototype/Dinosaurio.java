/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype;

/**
 *
 * @author Joaquin
 */
public class Dinosaurio implements Cloneable{
    private String especie;
    private String nombre;
    private float pesoEnKg;
    public Dinosaurio(){ 
    } 
    public Dinosaurio(String especie, String nombre, float peso){
        this.especie=especie;
        this.nombre=nombre;
        this.pesoEnKg=peso;
    }
    public String getEspecie() {
        return this.especie;
    }
    public String getNombre() {
        return this.nombre;
    }
    public float getPesoEnKg() {
        return this.pesoEnKg;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPesoEnKg(float pesoEnKg) {
        this.pesoEnKg = pesoEnKg;
    }
    @Override
    public Dinosaurio clone(){
        Dinosaurio dinoClonado = new Dinosaurio();
        dinoClonado.setNombre(this.getNombre());
        dinoClonado.setEspecie(this.getEspecie());
        dinoClonado.setPesoEnKg(this.getPesoEnKg());
        return dinoClonado;
    }
    
    /* forma de hacerlo con el metodo clone de Object, clonacion de java, como estás usando metodo de object, no se necesita crear la interfaz Cloneable.
    @Override
    public Dinosaurio clone() {
        try {
            return (Dinosaurio) super.clone(); // 💖 clone nativo
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e); // java requiere controlar este trycatch por mas que vos sepas que la clase tiene Cloneable implementado.
        }
    }*/
    @Override
    public String toString() {
        return "Dinosaurio{" + "especie=" + especie + ", nombre=" + nombre + ", pesoEnKg=" + pesoEnKg + '}';
    }
    
}
