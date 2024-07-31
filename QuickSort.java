public class QuickSort {
    public static void main(String[] args) {

        int quickI, quick[] = { 53, 9, 5, 1, -3, 3, 10, 8, -5, 4, 6, 7, 2 };

        System.out.println("Vetor desordenado: ");
        for (quickI = 0; quickI < quick.length; quickI++) {
            System.out.println(quick[quickI]);
        }

        quick = QuickSort.quicksort(0, quick.length - 1, quick);

        System.out.println("\nVetor ordenado: ");
        for (quickI = 0; quickI < quick.length; quickI++) {
            System.out.println(quick[quickI]);
        }
    }

    public static int[] quicksort (int p, int q, int vetor[]){
        int x;

        if (p < q) {
            x = particaoQuick(p, q, vetor);
            quicksort(p, x - 1, vetor);
            quicksort(x + 1, q, vetor);
        }

        return vetor;
    }

    public static int particaoQuick(int p, int q, int vetor[]) {
        int j = p - 1;
        int temp, aux = vetor[q];

        for (int i = p; i <= q; i++) {
            if (vetor[i] <= aux) {
                j++;
                temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        return j;
    }
}
