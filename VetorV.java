public class VetorV {
    public static void main(String[] args) {
        int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Indice: %d\n", v[i]);
        }

        int soma = v[2] + v[5];

        System.out.printf("Soma: %d + %d = %d\n", v[2], v[5], soma);

        int v10[] = new int[10];

        int somas = 0;

        System.out.println();
        for (int i = 0; i < v10.length; i++) {
            v10[i] = i + 1;
            somas = somas + v10[i];

            System.out.printf("Indice vetor [%d]: %d\n", i, v10[i]);
        }

        System.out.printf("Soma de todos os elementos do vetor 2: %d\n", somas);
    }
}