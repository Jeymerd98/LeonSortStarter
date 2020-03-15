package edu.ujcv.progra1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] elementos = {3,2,4,5,6,7,9,9,10,3,5};
        MergeSort m = new MergeSort();
        elementos = m.MergeSort(elementos);

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }

        elementos = new int[]{3,2,4,5,6,7,9,9,10,3,5};
        System.out.println("\n\ntarda "+ m.sort(elementos)+ " milisegundos");
    }
}
