package edu.ujcv.progra1;

public class BubleSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        BubleSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public int[] BubleSort(int[] arr){

        int temp;
        for (int i = 0; i < arr.length ; i++){
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

