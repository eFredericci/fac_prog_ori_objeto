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
    String tipo;
    String dono;
    float saldo;
    private boolean status;
    
    public void abrirConta() {
        if (tipo.equals("CC")) {
            saldo = saldo + 50;}
        else {
            saldo = saldo + 150;
        }        
    }
    public void fecharConta() {
        if (saldo > 0) {
            println("Conta com dinheiro");
        }
        if (saldo < 0){
            println("Saldo em débito");
    }
        else {
            setStatus(false);
        }
        
    }

    /**
     *
     * @param v
     */
    public void depositar(float v) {
        if (status = true){
            setSaldo(v + getSaldo());
        } else {
            println("Impossível depositar");
        }
        
    }

    /**
     *
     * @param v
     */
    public void sacar(float v) {    
        
        if (status = true){
            if (saldo > v) {
                saldo = (saldo + v);
            }
            else {
                println("Saldo insuficiente");               
            }
        }
        else {
            println("Impossivel sacar");
        }
            
        
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
    public String getTipo() {
        return this.tipo;
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

    private void setStatus(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void println(String saldo_em_débito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSaldo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void depositar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
