/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author afviray
 */
public class JavaApplication1 {

    public static boolean isTrue(String str){
            return str.matches("[tT]rue");
    }
    
    public static boolean containsFalse(String str){
            return str.matches(".*false.*");
    }
    
    
    public static void main(String[] args) {
        
        System.out.println(isTrue("true"));
        System.out.println(containsFalse("kushfdskjdgf"));
    }
    
}
