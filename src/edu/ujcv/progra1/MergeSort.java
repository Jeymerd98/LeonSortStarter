package edu.ujcv.progra1;

public class MergeSort  implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        MergeSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private void MergeSort(int[] array) {
    }
    public static void merge(int a[],int inf, int d, int sup){
        int i, j, k;
        int [] b = new int[a.length];
        for (i = inf; i <= sup; i++)
            b[i] = a[i];

        i=  inf; j = d + 1; k = inf;
        while (i <= d && j <= sup)
            if (b[i] <= b[j])
                a[k++] = b[i++];
            else
                a[k++] = b[j++];
        while (i <= d)
            a[k++] = b[i++];
    }
}
