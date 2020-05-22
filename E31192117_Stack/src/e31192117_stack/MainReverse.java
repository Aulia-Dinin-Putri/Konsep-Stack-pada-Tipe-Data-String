/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192117_stack;

import java.util.Scanner;

/**
 *
 * @author AULIA DININ
 */
public class MainReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan Kalimat: ");
        String input=sc.nextLine();
        E31192117_Stack_BalikKalimat myStack=new E31192117_Stack_BalikKalimat(1000);
        int i=0;
        for (char c : input.toCharArray()) {
            myStack.push("" + c);
        }
        System.out.println("Hasil Reverse: ");
        while(!myStack.isEmpty()){
            System.out.print(myStack.pop());
        }
        System.out.println(" ");
    }
}
