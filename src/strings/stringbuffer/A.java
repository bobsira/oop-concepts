/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.stringbuffer;

/**
 *
 * @author bobsira
 */
public class A {
    
    public static void threeLines(){
        newLine();newLine();newLine();
    }
    
    public static void newLine(){
        System.out.println();
    }
    
    public static void main (String[] args ){
        
        //The append() method concatenates the given argument with this string.
        
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // now original string is changed
        System.out.println(sb); // prints Hello World
        threeLines();
        
        //The insert() method inserts the given string with this string at the given position.
        sb.insert(0,"Guys ");//now original string is changed  
        System.out.println(sb);//prints Guys Hello World
        threeLines();
        
        
        //The replace() method replaces the given string from the specified beginIndex and endIndex.
        sb.replace(0,4,"Niggas");  
        System.out.println(sb);//prints Niggas Hello World
        threeLines();
        
        //The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.
        sb.delete(0,6);  
        System.out.println(sb);// Hello World
        threeLines();
        
        //The reverse() method of StringBuffer class reverses the current string.
        sb.reverse();
        System.out.println(sb); // dlroW olleH
        sb.reverse();
        threeLines();
        
        
        //The capacity() method of StringBuffer class returns the current capacity of the buffer. 
        //The default capacity of the buffer is 16
        //If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.
        
        
        StringBuffer stringbuffer = new StringBuffer();
        System.out.println(stringbuffer.capacity()); // default 16
        stringbuffer.append("Hello");
        System.out.println(stringbuffer.capacity()); //now 16
        stringbuffer.append("java is my favourite language");
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+
        threeLines();
    }
    
}
