/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author bobsira
 */

//The String equals() method compares the original content of the string. It compares values of string for equality.

public class Teststringcomparison2 {
    
    public static void main(String[] args ){
        String s1 = "sirasira";
        String s2 = "SIRASIRA";
        
        System.out.println(s1.equals(s2)); //FALSE
        System.out.println(s1.equalsIgnoreCase(s2)); //true
    }
    
}
