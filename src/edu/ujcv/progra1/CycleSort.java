package edu.ujcv.progra1;

public class CycleSort  implements SortTester {

    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        cycleSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }
    public static void cycleSort(int[] input) {

        for (int a = 0, buscador, pos; a < input.length - 1; a++) {

            buscador = input[a];
            pos = a;
            for (int i = a + 1; i < input.length; i++) {
                if (input[i] < buscador) {
                    pos++;
                }
            }
            if (pos == a) {
                continue;
            }
            while (buscador == input[pos]) {
                pos++;
            }
            buscador = set(input, buscador, pos);

            while (pos != a) {
                pos = a;
                for (int i = a + 1; i < input.length; i++) {
                    if (input[i] < buscador) {
                        pos++;
                    }
                }
                while (buscador == input[pos]) {
                    pos++;
                }
                buscador = set(input, buscador, pos);
            }
        }
    }
    private static int set(int[] array, int data, int index) {
        try {
            return array[index];
        } finally {
            array[index] = data;
        }
    }
}
        /*static int[] cycleSort(int[] a) {
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
        }
         */