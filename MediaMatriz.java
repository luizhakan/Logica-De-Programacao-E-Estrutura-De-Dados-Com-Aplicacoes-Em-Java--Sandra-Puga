import javax.swing.JOptionPane;

public class MediaMatriz {
    public static void main(String[] args) {
        float notas[][] = new float[4][4], media;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Nota [" + i + "][" + j + "]: "));
            }
        }

        media = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                media = media + notas[i][j];
            }
        }

        media = media / (4 * 4);

        JOptionPane.showMessageDialog(null, "Media: " + media);
    }
}
