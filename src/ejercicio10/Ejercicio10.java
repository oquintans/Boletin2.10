/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int b100,b20,b5,m1,dinero;
        
        System.out.println("Dinero Total:");
        Scanner dato=new Scanner(System.in);
        dinero=dato.nextInt();
        b100=dinero/100;
        b20=dinero%100/20;
        b5=dinero%100%20/5;
        m1=dinero%100%20%5;
        System.out.println("Billetes de 100€:"+b100);
        System.out.println("Billetes de 20€:"+b20);
        System.out.println("Billetes de 5€:"+b5); 
        System.out.println("Monedas de 1€:"+m1);
        
    }
    
}
