/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.tostringmethod;

/**
 *
 * @author bobsira
 */
public class Student {
    
    private int rollno;
    private String name;
    private String city;
    
    
    public Student( int rollno, String name, String city){
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }
    
    
    public static void main (String[] args ){
         Student s1=new Student(101,"Raj","lucknow");  
         Student s2=new Student(102,"Vijay","ghaziabad");  
     
         System.out.println(s1);//compiler writes here s1.toString()  
         System.out.println(s2);//compiler writes here s2.toString()  
    }
    
    
    
}
