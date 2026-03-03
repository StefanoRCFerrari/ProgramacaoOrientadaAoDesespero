/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0213;

/**
 *
 * @author stefano.ferrari
 */
import java.util.Scanner;

public class Aula0213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float lado1, lado2, area;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Lado 1: ");
        lado1 = sc.nextFloat();
        System.out.println("Lado 2: ");
        lado2 = sc.nextFloat();
        
        area = lado1 * lado2;
        
        System.out.println("Area = " + area);   
        }
}
