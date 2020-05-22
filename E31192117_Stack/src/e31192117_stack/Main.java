/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192117_stack;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args){
        E31192117_Stack stack=new E31192117_Stack();
        stack.push("Aulia");
        stack.push("Dinin");
        stack.push("Putri");
        stack.push("Alifiah");
        
        int data=stack.data();
        Object object=stack.display();
        System.out.println("Jumlah Data Pada Stack : "+data);
        System.out.println("Data Teratas Pada Stack : "+object);
        
        System.out.println("===================================");
        
        object=stack.pop();
        System.out.println("Objek yang dikeluarkan (Pop) : "+object);
        data=stack.data();
        System.out.println("Jumlah Data Pada Stack setelah Pop: "+data);
        object=stack.display();
        System.out.println("Data Teratas Pada Stack setelah Pop: "+object);
    }
}
