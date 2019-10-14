/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;


/**
 *
 * @author Eduardo
 */
public class CriarContaBanco {
    public static void main(String[] args) {
        ContaBanco caixa = new ContaBanco();
        caixa.tipo = "cp";
        caixa.abrirConta();
        caixa.saldo = 10;
        caixa.depositar();
        caixa.dono = "Eduardo";
        caixa.numConta = 666;
        caixa.show();
    }
}
