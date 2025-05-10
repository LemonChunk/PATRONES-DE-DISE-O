/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Sala2-02
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AtaqueDePie estrategia1 = new AtaqueDePie();
        Personaje personaje1 = new Personaje("Alex", estrategia1);
        personaje1.atacar();
        AtaqueAgachado estrategia2 = new AtaqueAgachado();
        personaje1.cambiarEstiloDeAtaque(estrategia2);
        personaje1.atacar();
        AtaqueAereo estrategia3= new AtaqueAereo();
        personaje1.atacar();
    }
    
}
