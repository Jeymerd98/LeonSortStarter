package edu.ujcv.progra1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] elementos = new int[10000];
        Random r = new Random();

        for (int i = 0; i < elementos.length ; i++) {
            elementos[i] = Math.abs(r.nextInt(10000));
        }
        BubleSort b = new BubleSort();
        int a = elementos.length;
        b.BubleSort(elementos);

        /*HeapSort h = new HeapSort();
        int a = elementos.length;
        h.heapSort(elementos);*/

        /*MergeSort h = new MergeSort();
        int a = elementos.length;
        h.MergeSort(elementos);*/

        /*CycleSort h = new CycleSort();
        int a = elementos.length;
        h.cycleSort(elementos);*/

       // h.cycleSort(elementos);

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }
        System.out.println("\n\ntarda "+ b.sort(elementos)+ " milisegundos");
    }
}
