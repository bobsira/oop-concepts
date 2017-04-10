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
public class TestStringConcatenation1 {
    
    public static void main (String [] args ){
        
        String s = "sirasira" + " tiffany";
        System.out.println(s); // sirasira tiffany
    }
    
}

// what happens
//String s = (new StringBuilder()).append("sirasira").append(" tiffany).toString();  
//In java, String concatenation is implemented through the StringBuilder (or StringBuffer) class and its append method
