package exercício;


import java.util.*;


public class MyOwnLists<T> {


    public static <T>List<T> asListedSorted(T[] a, Comparator<T> b) {

        List<T> listaOrdenada = new ArrayList<>();

        Collections.addAll(listaOrdenada, a);

        Collections.sort(listaOrdenada, b);
        return listaOrdenada;
    }
}


