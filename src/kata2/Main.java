/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata2;

import java.util.HashMap;

/**
 * @author Antonio Miguel Martel
 */
public class Main {


    public static void main(String[] args) {
        System.out.println("Hola soy la kata 2");
        
        int[] data = new int[16];
        for (int i = 0; i < data.length; i++) {
            data[i] = i+ 1;
        }
        data[15] = 1;
        HashMap<Integer, Integer> histogram =new HashMap<>();
        // WOW
        // Para cada valor key que esta en data: key toma cada valor del array data
        for (int key : data) {
            // En este operador ternario:
            // El operador ternario esta dentro del put. Si lo contiene le suma 1
            //A su indice y si no, inicializa su indice a 1.
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
            System.out.println(key + "==>" + histogram.get(key));
        }
        
        
        
    }

}
