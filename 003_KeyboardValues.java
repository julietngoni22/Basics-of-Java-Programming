/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

import java.util.Scanner;

/**
 *
 * @author juliet
 */
//Obtaining values from the keyboard
 //import the Scanner class from the java.util package
public class Values {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
         Scanner k = new Scanner(System.in);
        System.out.print("What is your name: ");
   String name ; // this is called declaring a variable
           name = k.nextLine();
        System.out.println("Dumela " + name + "!!");// a method called to read data from the keyboard.
        
        
    }//end main method
    
}//end class
