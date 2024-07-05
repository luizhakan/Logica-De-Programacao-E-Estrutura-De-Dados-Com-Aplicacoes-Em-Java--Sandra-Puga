import javax.swing.JOptionPane;

public class Impar{
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));

        if (numero % 2 != 0) {
            JOptionPane.showMessageDialog(null, "O número é ímpar!");
        } else {
            JOptionPane.showMessageDialog(null, "O número é par!");
        }
    }
}