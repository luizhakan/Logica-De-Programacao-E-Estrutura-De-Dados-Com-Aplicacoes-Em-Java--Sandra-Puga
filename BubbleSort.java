public class BubbleSort {
    public static void main(String[] args) {

        int bubbleI, bubble[] = { 53, 9, 5, 1, 3, 10, 8, 4, 6, 7, 2, };

        System.out.println("Vetor desordenado: ");
        for (bubbleI = 0; bubbleI < bubble.length; bubbleI++) {
            System.out.println(bubble[bubbleI]);
        }

        bubble = bolha(bubble);

        System.out.println("\nVetor ordenado: ");
        for (bubbleI = 0; bubbleI < bubble.length; bubbleI++) {
            System.out.println(bubble[bubbleI]);
        }
    }

    public static int[] bolha(int numeros []) {
        final int n = numeros.length;
        int aux;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        
        return numeros;
    }
}
