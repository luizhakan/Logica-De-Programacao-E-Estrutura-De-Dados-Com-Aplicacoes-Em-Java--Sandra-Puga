import javax.swing.JOptionPane;

public class MediaFor {

    public static void main(String[] args) {
        float media = 0, nota, soma = 0;

        for (int i = 0; i < 4; i++) {
            nota = Float.parseFloat(JOptionPane.showInputDialog("Nota: "));
            soma = soma + nota;
        }

        media = soma / 4;

        JOptionPane.showMessageDialog(null, "Media: " + media);
    }
}