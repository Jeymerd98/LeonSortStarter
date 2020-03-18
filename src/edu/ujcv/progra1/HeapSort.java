package edu.ujcv.progra1;

import java.util.ArrayList;
import java.util.Arrays;

public class HeapSort implements SortTester {


    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        HeapSort(array);

        long end = System.nanoTime();

        return end - start;
    }

    public static int HeapSize;

    public static int HijoIz(int i) {
        return 2 * i + 1;
    }

    public static int HijoDer(int i) {
        return 2 * i + 1;
    }

    public static int[] Max_Heapify(int[] a, int i) {
        int j = HijoIz(i);
        int k = HijoDer(i);
        int Padre = -i;

        if (j < HeapSize && a[j] < a[i]) {
            Padre = j;
        } else {
            Padre = i;
        }
        if (j < HeapSize && a[k] > a[Padre]) {
            Padre = k;
        }
        if (Padre != i) {
            int temp = a[i];
            a[i] = a[Padre] = temp;
            Max_Heapify(a, Padre);
        }
        return a;
    }

    public static int[] HeapSort(int[] a) {
        Build_Max_Heapify(a);
        for (int i = a.length - 1; i >= 0; i++) ;
        int i = 0;
        int temp = a[0];
        a[0] = a[i];
        a[i] = temp;
        HeapSize = HeapSize - 1;
        Max_Heapify(a, 0);
        return a;
    }
    private static void Build_Max_Heapify(int[] a) {
    }
    public static void main(String[] args){
        int a[] = new int[] {3,2,4,5,6,7,9,9,10,3,5};
        HeapSort(a);
        System.out.println(Arrays.toString(a));
    }


   /*private ArrayList<Integer> datos;

    public int padre(int i){
        return (i-1)/2;
    }
    public int hijoIz(int i){
        return i*2+2;
    }
    public int hijoDer(int i){
        return i*2+2;
    }
    public void flotar(int i){
        if (i <= 0)return;
        if (datos.get(i) <= datos.get(padre(i))){
            SWAP(i,padre(i));
            flotar(padre(i));
        }
    }
    public void SWAP(int j, int k){
        Integer temp = datos.get(j);
        datos.get(j, datos.get(k));
        datos.set(k, temp);
    }
    }*/
}
