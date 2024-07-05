import javax.swing.JOptionPane;

public class Soma {
    public static void main(String[] args) {
        int valor1, valor2, soma;

        do {
            try {
                valor1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor?"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
                JOptionPane.showMessageDialog(null, "Digite um número!");
                valor1 = -1;
            }
        } while (valor1 < 0);

        do {
            try {
                valor2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor?"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
                JOptionPane.showMessageDialog(null, "Digite um número!");
                valor2 = -1;
            }
        } while (valor2 < 0);

        soma = valor1 + valor2;

        JOptionPane.showMessageDialog(null, "Resultado: " + soma);
    }
}
