/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exce2;

/**
 *
 * @author stefano.ferrari
 */
public class saldoins extends Exception{
        
    private double diferenca;
    
    public saldoins(double saldo, double valor, String msg){
        super(msg);
        this.diferenca = valor - saldo;
    }
    
    public double getDif(){
        return this.diferenca;
    }
    
}
