/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

/**
 *
 * @author 1822220623
 */
public class ContaBanco {
    public int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public void abrirConta() {
        
    }
    public void fecharConta() {
        
    }
    public void depositar() {
        
    }
    public void sacar() {
        
    }
    public void pagarMensal() {
        
    }
    public void ContaBanco () {
        this.saldo = 0;
        this.status = false;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public String getDono() {
        return this.dono;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
