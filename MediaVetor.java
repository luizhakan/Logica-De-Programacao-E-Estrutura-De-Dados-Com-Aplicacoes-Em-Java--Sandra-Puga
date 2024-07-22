import javax.swing.JOptionPane;
public class MediaVetor {

    public static void main(String[] args) {

        float v[] = new float[10];

        float soma = 0;

        for (int i = 0; i < v.length; i++) {
            v[i] = Float.parseFloat(JOptionPane.showInputDialog("Nota [" + i + "]: "));
            soma = soma + v[i];
        }

        JOptionPane.showMessageDialog(null, "Media: " + (soma / v.length));

    }
}