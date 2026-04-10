/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exce2;

/**
 *
 * @author stefano.ferrari
 */
public class conta {
    
    private int numConta;
    private double saldo;
    
    public conta(int numConta){
        this.numConta = numConta;
        this.saldo = 0;
    }
    
    public void dep(double valor){
        this.saldo += valor;
    }
    
    public void sac(double valor) throws Exception{
        if (valor <= this.saldo)
            this.saldo -= valor;
        else
            throw new saldoins(this.saldo, valor, "Saldo Insuficiente");
    }
    
}
