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
public class TestStringMethods3 {
    public static void main ( String[] args ){
        
        String s = "sirasira";
        
        System.out.println(s.startsWith("si"));
        System.out.println(s.endsWith("ra"));
        
        //The string charAt() method returns a character at specified index.
        
        System.out.println(s.charAt(0)); //s
        System.out.println(s.charAt(3));
        
        
        //The string length() method returns length of the string.
        
        System.out.println(s.length()); //8
        
        
        //The string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string.
        
        int a=10;  
        String string = String.valueOf(a);  
        System.out.println( string +10 );  
        
        //The string replace() method replaces all occurrence of first sequence of character with second sequence of character.
        
        String s1="Java is a programming language. Java is a platform. Java is an Island.";    
        String replaceString=s1.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
        System.out.println(replaceString); 
    }
    
}
