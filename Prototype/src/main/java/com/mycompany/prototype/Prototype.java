/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prototype;

/**
 *
 * @author Joaquin
 */
public class Prototype {

    public static void main(String[] args) {
        System.out.println("Hello Jurassic World!");
        Dinosaurio prototipo = new Dinosaurio("Giganotosaurio", "MUCPv-Ch1", 13800);
        Dinosaurio clon = prototipo.clone();
        System.out.println("Dinosaurio original:");
        System.err.println(prototipo.toString());
        System.out.println("Dinosaurio Clonado");
        System.err.println(clon.toString());
        clon.setNombre("MUCPv-Ch2");
        System.err.println("Si modifico el clon, el original no se ve afectado: ");
        System.out.println("Dinosaurio original:");
        System.err.println(prototipo.toString());
        System.out.println("Dinosaurio Clonado");
        System.err.println(clon.toString());
    }
}
