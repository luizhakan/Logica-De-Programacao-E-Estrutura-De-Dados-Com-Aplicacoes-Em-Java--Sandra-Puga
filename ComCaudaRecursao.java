import javax.swing.JOptionPane;

public class ComCaudaRecursao {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que você quer calcular o fatorial"));

        if (numero < 0)
            JOptionPane.showMessageDialog(null,
                    "Valor inválido para o cálculo do fatorial, precisa ser maior ou igual a zero!");
        else
            JOptionPane.showMessageDialog(null, "Fatorial: " + new ComCaudaRecursao().fatorial(numero));

    }

    public int fatorial(int n) {
        int f;

        if (n == 0 || n == 1) {
            return 1;
        } else {
            f = fatorial(n - 1) * n;

            return f;
        }
    }
}