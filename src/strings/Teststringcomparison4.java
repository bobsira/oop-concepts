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

//The String compareTo() method compares values lexicographically 
//and returns an integer value that describes if first string is less than, equal to or greater than second string.

public class Teststringcomparison4 {
    
    public static void main (String[] args ){
        
        String s1 = "sirasira";
        String s2 = "sirasira";
        String s3 = "tiffany";
        
        System.out.println(s1.compareTo(s2));//0  
        System.out.println(s1.compareTo(s3));//-1(because s1<s3)  
        System.out.println(s3.compareTo(s1));//1(because s3 > s1 )  
    }
    
}
