/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Antonio Miguel Martel
 */
public class Main {


    public static void main(String[] args) {
        System.out.println("Hola soy la kata 2");
        
        Integer[] data = new Integer[16];
        for (int i = 0; i < data.length; i++) {
            data[i] = i+ 1;
        }
        data[15] = 1;
        
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (int key : data) {
            System.out.println(key + "==>" + histogr.get(key));
        }
        
    }

}
