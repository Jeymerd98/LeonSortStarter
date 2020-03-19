package edu.ujcv.progra1;

public class CycleSort  implements SortTester {

    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        cycleSort(array);

        long end = System.nanoTime();

        return end - start;
    }

        static int[] cycleSort(int[] a) {
            int writes = 0;

            for (int cycleStart = 0; cycleStart < a.length - 1; cycleStart++) {
                int val = a[cycleStart];

                int pos = cycleStart;
                for (int i = cycleStart + 1; i < a.length; i++)
                    if (a[i] < val)
                        pos++;

                if (pos == cycleStart)
                    continue;

                while (val == a[pos])
                    pos++;

                int tmp = a[pos];
                a[pos] = val;
                val = tmp;
                writes++;

                while (pos != cycleStart) {
                    pos = cycleStart;
                    for (int i = cycleStart + 1; i < a.length; i++)
                        if (a[i] < val)
                            pos++;

                    while (val == a[pos])
                        pos++;

                    tmp = a[pos];
                    a[pos] = val;
                    val = tmp;
                    writes++;
                }
            }
            return new int[]{writes};
        }}