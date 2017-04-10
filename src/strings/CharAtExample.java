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
public class CharAtExample {
    
    public static void main (String[] args ){
        
        String name = "sirasira";
        char ch = name.charAt(4); //returns the char value at the 4th index
        System.out.println(ch);  
        
        //char character = name.charAt(10); returns the char value at the 10th index
        //System.out.println(character); java.lang.StringIndexOutOfBoundsException
    }
    
}
