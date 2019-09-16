/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author aluno
 */
public class Aula2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Caneta c1;
        c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        c1.ponta = (float) 0.5;
        c1.status();
    }
    
}
