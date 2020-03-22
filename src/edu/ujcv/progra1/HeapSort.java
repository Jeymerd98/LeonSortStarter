package edu.ujcv.progra1;

public class HeapSort implements SortTester {

    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        heapSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public int[] heapSort(int[] array) {
            int n = array.length;

            for (int i = n/2-1; i >= 0; i--) {
                Flotar(array, n, i);
            }
            for (int i = n - 1; i >= 0; i--) {

                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;

                Flotar(array,i,0);
            }
        return array;
    }
    public void Flotar(int[] arr, int n, int i) {

        int padre = i;
        int hijoIz = i * 2 + 1;
        int hijoDer = i * 2 + 2;

        if (hijoIz < n && arr[hijoIz] > arr[padre]) {
            padre = hijoIz;
        }
        if (hijoDer < n && arr[hijoDer] > arr[padre]) {
            padre = hijoDer;
        }
        if (padre != i) {
            int temp = arr[i];
            arr[i] = arr[padre];
            arr[padre] = temp;

            Flotar(arr, n, padre);
        }
    }
}
    /*public static int padre(int a[], int i){
        if(i == 0)
            return -1;
        else
            return(i - 1)/2;
    }
    public static int hijoIz(int a[], int i){
        if(2 * i + 1 >= a.length)
            return -1;
        else
            return (2 * i + 1);
    }
    public static int hijoDer(int a[], int i){
        if(2 * i + 1 >= a.length)
            return -1;
        else
            return (2 * i + 1);
    }
    private static int[] HacerMonticulo(int[] a, int n){
        n = a.length;
        for(int i = 0; i < n; i++){
            if(padre(a, i) != -1){
                int padre = a[padre(a, i)];
                if(a[i] > padre){
                    int aux = padre;
                    a[padre(a, i)] = a[i];
                    a[i] = aux;
                    HacerMonticulo(a, n);
                }
            }
        }
        return a;
    }
    public static int[] eliminarRaiz(int a[], int n){
        int aux;
        aux = a[n - 1];
        a[n - 1] = a[0];
        a[0] = aux;
        return a;
    }
    public static int[] heapSort(int a[]) {
        int n = a.length;
        int Monticulo[] = HacerMonticulo(a, n);

        for (int i = 0; i < Monticulo.length; i++) {
            i = 0;
            Monticulo = eliminarRaiz(Monticulo, n - i);
            Monticulo = HacerMonticulo(Monticulo, n - i - 1);
        }
        return Monticulo;
    }
}
    /*public static int HeapSize;

    public static int HijoIz(int i) {
        return 2 * i + 1;
    }

    public static int HijoDer(int i) {
        return 2 * i + 1;
    }

    public static void Max_Heapify(int[] a, int i) {
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
    }

    public static int[] HeapSort(int[] a) {
        for (int i = a.length - 1; i >= 0; i++) ;
        int i = 0;
        int temp = a[0];
        a[0] = a[i];
        a[i] = temp;
        HeapSize = HeapSize - 1;
        Max_Heapify(a, 0);
        return a;
    }*/
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
