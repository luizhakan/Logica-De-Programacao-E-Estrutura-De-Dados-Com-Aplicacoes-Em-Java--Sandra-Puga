import javax.swing.JOptionPane;

public class MediaGeometricaVetor {
    public static void main(String[] args) {
        int g[][] = new int[6][2];
        int i, j;
        double prod = 1;
        int contador = 0;

        for (i = 0; i < 6; i++) {
            for (j = 0; j < 2; j++) {
                g[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Elemento [" + i + "][" + j + "]: "));
                prod *= g[i][j];
                contador++;
            }
        }

        double mediaGeometrica = Math.pow(prod, 1.0 / contador);

        JOptionPane.showMessageDialog(null, "Media Geometrica: " + mediaGeometrica);
    }
}
