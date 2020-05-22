/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192117_stack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class E31192117_Stack {

    //Menyimpan object yang dimasukkan di Stack
    private List<Object> list = new ArrayList<Object>();
    //Menandai posisi teratas, index teratas adalah 0 maka =-1
    private int posisi = -1;

    //Method push untuk menambahkan data stack
    public void push(Object object) {
        list.add(object);
        posisi++;
    }

    //Method pop untuk mengambil data stack
    public Object pop() {
        Object object = list.remove(posisi); //mengambil data teratas
        posisi--; //data dikurangi 1
        return object;
    }

     //Method ini untuk mengetahui jumlah data stack
    public int data() {
        return list.size();
    }

    //Method display untuk menampilkan data teratas stack
    public Object display() {
        return list.get(posisi);
    }

    //Method clear untuk menghapus seluruh data stack
    //dan mengembalikan index ke nilai semula
    public void clear() {
        list.clear();
        posisi = -1;
    }

}
