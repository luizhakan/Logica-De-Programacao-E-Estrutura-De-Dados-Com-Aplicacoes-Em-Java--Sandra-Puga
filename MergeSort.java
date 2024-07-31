public class MergeSort {
    public static void main(String[] args) {
        int[] a = { 53, 9, 5, 1, 3, 10, 8, 4, 6, 7, 2 };

        System.out.println("Vetor desordenado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        mergeSort(a, 0, a.length - 1);

        System.out.println("\nVetor ordenado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void mergeSort(int[] a, int inicio, int fim){
        if (inicio == fim) {
            return;
        }

        int meio = (inicio + fim) / 2;
        mergeSort(a, inicio, meio);
        mergeSort(a, meio + 1, fim);
        merge(a, inicio, meio, fim);
    }

    public static void merge(int[] a, int inicio, int meio, int fim){
        int n = fim - inicio + 1, i1 = inicio, i2 = meio + 1, j = 0;
        int[] b = new int[n];

        while (i1 <= meio && i2 <= fim) {
            if (a[i1] < a[i2]) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        while (i1 <= meio) {
            b[j] = a[i1];
            i1++;
            j++;
        }

        while (i2 <= fim) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            a[inicio + j] = b[j];
        }
    }
}
