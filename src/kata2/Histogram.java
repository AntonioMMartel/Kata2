package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Antonio Miguel Martel
 * T de type
 */
public class Histogram<T> {
    
    // Todos los int[] por T[].
    // Eso hace que en vez de entrarme ints me entran objetos cualquiera.
    T[] data;

    public Histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    
    //Cambiamos el tipo Integer por un tipo T
    public Map<T, Integer> getHistogram(){
        
        HashMap<T, Integer> histogram =new HashMap<>();
        for (T key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        return histogram;
        
    }
    
    
    
}
