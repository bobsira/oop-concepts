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

public class Teststringcomparison {
    
    public static void main (String [] args ){
        
        String s1 = "sirasira";
        String s2 = "sirasira";
        String s3 = new String ("sirasira");
        String s4 = "siras";
        
        
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //false
    }
    
}
