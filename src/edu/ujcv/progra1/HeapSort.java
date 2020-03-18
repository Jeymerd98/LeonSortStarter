package edu.ujcv.progra1;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.ArrayList;
import java.util.concurrent.PriorityBlockingQueue;

public class HeapSort implements SortTester {


    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        HeapSort(array);

        long end = System.nanoTime();

        return end - start;
    }
    private ArrayList<Integer>datos;

    private int padre(int i){
        return (i-1)/2;
    }
    private int hijoIz(int i){
        return i*2+2;
    }
    private int hijoDer(int i){
        return i*2+2;
    }
    public void flotar(int i){
        if (i <= 0)return;
        if (datos.get(i) <= datos.get(padre(i))){
            SWAP(i,padre(i));
            flotar(padre(i));
        }
    }
    private void SWAP(int j, int k){
        Integer temp = datos.get(j);
        datos.get(j, datos.get(k));
        datos.set(k, temp);
    }
    }
