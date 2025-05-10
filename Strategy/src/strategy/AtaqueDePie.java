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
public class AtaqueDePie implements EstrategiaParaAtaque{
    @Override
    public void atacar(){
        System.out.println("Ejecutando el comando de ataque de pie");
    }
}
