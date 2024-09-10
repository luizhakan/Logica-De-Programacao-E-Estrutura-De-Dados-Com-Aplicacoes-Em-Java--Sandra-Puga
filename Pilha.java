public class Pilha {
    private int vet[];
    private int topo;
    private int tamanho;

    public static void main(String[] args) {
        Pilha p = new Pilha();
        
    }

    public void Empilhar(int elemento) {
        if (!PilhaCheia()) {
            topo = topo + 1;
            vet[topo] = elemento;
        } else {
            System.out.println("Pilha Cheia");
        }
    }

    public boolean PilhaVazia() {
        if (topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean PilhaCheia() {
        if (topo >= tamanho - 1) {
            return true;
        } else {
            return false;
        }
    }

    public int Desempilhar() {
        int desempilhado = 0;

        if (PilhaVazia()) {
            System.out.println("Pilha Vazia");
        } else {
            desempilhado = vet[topo];
            topo = topo - 1;
        }

        return desempilhado;
    }

    public void ElementoTopo() {
        if (topo >= 0) {
            System.out.println("Elemento Topo: " + vet[topo]);
        } else {
            System.out.println("Pilha Vazia");
        }
    }

    public void MostrarPilha() {
        int i;

        for (i = topo; i >= 0; i--) {
            System.out.println("Elemento: " + vet[i] + " - Posicao: " + i + "da Pilha");
        }
    }
}
