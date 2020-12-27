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
        for (int i = 0; i < data.length; i++) {
            // Un mapa devuelve null si no lo encuentra
            Integer estoyEnHistograma = histogram.get(data[i]);
            // Si no esta solo tengo 1
            if( estoyEnHistograma == null){
                histogram.put(data[i], 1);
            } else {
                //Si si esta sumo 1 a los que ya tenia.
                histogram.put(data[i], histogram.get(data[i])+1);
            }

            System.out.println(data[i] + "==>" + histogram.get(data[i]));
        }
        
        
        
    }

}
