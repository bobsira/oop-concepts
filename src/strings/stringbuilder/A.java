/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.stringbuilder;

/**
 *
 * @author bobsira
 */
public class A {
    
    public static void main(String args[]){  
    StringBuilder sb=new StringBuilder("Hello ");  
    sb.append("Java");//now original string is changed  
    System.out.println(sb);//prints Hello Java  
    
    sb.insert(0,"Guys ");//now original string is changed  
System.out.println(sb);

sb.replace(0,4,"Hey");  
System.out.println(sb);

sb.delete(0,3);  
System.out.println(sb);

sb.reverse();  
System.out.println(sb);
    sb.reverse();
    
}
    
}
