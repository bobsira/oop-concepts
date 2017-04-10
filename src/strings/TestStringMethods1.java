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

//The java string toUpperCase() method converts this string into uppercase letter 
//and string toLowerCase() method into lowercase letter.
public class TestStringMethods1 {
    
    public static void main(String[] args ){
        String s = "Sirasira";
        
        System.out.println(s.toUpperCase()); //SIRASIRA
        System.out.println(s.toLowerCase()); //sirasira
        System.out.println(s); // Sirasira  ( no change to the original)
    }
    
}
