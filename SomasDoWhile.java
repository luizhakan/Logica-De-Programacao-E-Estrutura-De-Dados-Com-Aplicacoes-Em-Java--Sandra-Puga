import javax.swing.JOptionPane;

public class SomasDoWhile {
    public static void main(String[] args) {
        float num = 0, soma = 0;

        do {
            num = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: (0 para sair)"));
            soma = soma + num;
        } while (num != 0);

        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}
