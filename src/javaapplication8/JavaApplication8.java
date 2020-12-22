/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Giorgio Del Rocca
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
     triangoli c=new triangoli(8.0,6.0,10.0);
     System.out.println(c.tipologia());
     System.out.println(c.area());
     System.out.println(c.perimetro());
    }
    
}
