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
public class Personaje {
    public String nombre;
    public EstrategiaParaAtaque estiloDeAtaque;
    public Personaje(String nombre,EstrategiaParaAtaque estrategia){
        this.estiloDeAtaque=estrategia;
        this.nombre=nombre;
    }
    public void cambiarEstiloDeAtaque(EstrategiaParaAtaque estrategia){
        this.estiloDeAtaque=estrategia;
    }
    public void atacar(){
        this.estiloDeAtaque.atacar();
    }
}
