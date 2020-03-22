package edu.ujcv.progra1;

import java.util.Random;

public class Promedio {
    public static void main(String[] args){
        int[] arreglo1 = new int[1000];
        int[] arreglo2 = new int[1000];
        int[] arreglo3 = new int[1000];
        int[] arreglo4 = new int[1000];

        Random random = new Random();

        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = Math.abs(random.nextInt(1000));
            arreglo2[i] = Math.abs(random.nextInt(1000));
            arreglo3[i] = Math.abs(random.nextInt(1000));
            arreglo4[i] = Math.abs(random.nextInt(1000));
        }

        BubleSort b = new BubleSort();
        //HeapSort b = new HeapSort();
        //MergeSort b = new MergeSort();
        //CycleSort b = new CycleSort();

        System.out.println("arrlego 1");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println(arreglo1[i] + " , ");
        }

        System.out.println("arrlego 2");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println(arreglo2[i] + " , ");
        }

        System.out.println("arrlego 3");
        for (int i = 0; i < arreglo3.length; i++) {
            System.out.println(arreglo3[i] + " , ");
        }

        System.out.println("arrlego 4");
        for (int i = 0; i < arreglo4.length; i++) {
            System.out.println(arreglo4[i] + " , ");
        }

        long time1 = b.sort(arreglo1);
        long time2 = b.sort(arreglo2);
        long time3 = b.sort(arreglo3);
        long time4 = b.sort(arreglo4);

        double promedio = time1 + time2 + time3 + time4;

        System.out.println("Arreglo 1: " + time1 + " , " + "Arreglo 2: " + time2 + " , " + "Arreglo 3: " + time3 + " , " + "Arreglo 4: " + time4 + " ");

        System.out.print("\nPromedio: ");
        System.out.println(promedio / 5  + " " + "milisegundos");
    }
}
