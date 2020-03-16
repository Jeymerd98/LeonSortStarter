package edu.ujcv.progra1;

import java.util.concurrent.PriorityBlockingQueue;

public class HeapSort implements SortTester {


    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        HeapSort(array);

        long end = System.nanoTime();

        return end - start;
    }

        public  int[] HeapSort(int[] array) {

            PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>();

            pbq.add(1);
            pbq.add(2);
            pbq.add(5);
            pbq.add(3);
            pbq.add(4);

            System.out.println("PriorityBlockingQueue:" + pbq);
            return array;
        }
    }
