package edu.ujcv.progra1;

import java.util.concurrent.PriorityBlockingQueue;

public class HeapSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        new heapSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public HeapSort(int[] elementos) {
    }

    public static class heapSort {
        public heapSort(int[] array) {
        }

        public static int[] heapSort(int[] array) {

            PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>();

            pbq.add(1);
            pbq.add(2);
            pbq.add(3);
            pbq.add(4);
            pbq.add(5);

            System.out.println("PriorityBlockingQueue:"
                    + pbq);
            return array;
        }
    }
    }