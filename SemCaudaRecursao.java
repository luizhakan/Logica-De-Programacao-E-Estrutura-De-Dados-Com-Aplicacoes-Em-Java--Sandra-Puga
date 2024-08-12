import javax.swing.JOptionPane;

public class SemCaudaRecursao {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que você quer calcular o fatorial"));

        if (numero < 0)
            JOptionPane.showMessageDialog(null, "Valor inválido para o cálculo do fatorial, precisa ser maior ou igual a zero!");
        else
            recursao(numero, numero, 1);
    }

    public static void recursao(int n, int x, int f) {
        if (x == 0 || x == 1) {
            String mensagem = String.format("O fatorial de %d é %d", n, f);
            JOptionPane.showMessageDialog(null, mensagem);
        } else {
            recursao(n, x - 1, f * x);
        }
    }
}