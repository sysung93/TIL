package chapter13.Generic04.exam02_generic_method;

public class Util {
    public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2){
        boolean keyCompare = p1.getKey().equals(p1.getKey());
        boolean valueCompare = p1.getValue().equals(p1.getValue());
        return keyCompare && valueCompare;
    }
}
