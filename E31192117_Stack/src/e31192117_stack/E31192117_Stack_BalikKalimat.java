/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192117_stack;

/**
 *
 * @author AULIA DININ
 */
public class E31192117_Stack_BalikKalimat {
    private String[] data;
    private int max_data;
    private int top;
    
    public E31192117_Stack_BalikKalimat(int size){
        max_data=size;
        data=new String[max_data];
        top=-1;
    }
    public boolean push(String value){
        boolean result=false;
        top++;
        if(top < max_data) {
            data[top]=value;
            result=true;   
        }else{
                top--;
        }
        return result;
    }
    public String pop(){
        String result=null;
        if(top >= 0){
            result=data[top];
            top--;
        }
        return result;
    }
    public boolean isEmpty(){
        boolean result=false;
        if(top<0){
            result=true;
        }
        return result;
    }
    public boolean isFull(){
        boolean result=false;
        if(top>=max_data-1){
            result=true;
        }
        return result;
    }
    public void Display(){
        System.out.println("[");
        if(isEmpty()){
            for (int i = 0; i <= top; i++) {
                System.out.print(data[i]+", ");
                
            }
        }
        System.out.println(" ]");
    }
}
