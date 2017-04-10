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
//The = = operator compares references not values.

public class Teststringcomparison3 {
    
    public static void main (String[] args){
        
        String s1 = "sirasira";
        String s2 = "sirasira";
        String s3 = new String ("sirasira");
        
        
        System.out.println(s1 == s2);  // true (bocs the both refer to the same instance)
        System.out.println(s1 == s3);  //false (bcoz s3 refers to the instance created in the non pool)
    }
    
}
