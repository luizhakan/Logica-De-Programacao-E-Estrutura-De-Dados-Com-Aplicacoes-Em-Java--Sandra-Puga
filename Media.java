import javax.swing.JOptionPane;

public class Media {

    public static void main(String[] args) {
        int contador = 0;
        float media = 0, nota = 0, notas = 0;

        while (nota != -1) {
            nota = Float.parseFloat(JOptionPane.showInputDialog("Nota: (-1 para sair)"));

            if (nota != -1) {
                notas = notas + nota;
                contador++;
            }
        }

        media = notas / contador;

        JOptionPane.showMessageDialog(null, "Quantidade de notas: " + contador);
        JOptionPane.showMessageDialog(null, "Media: " + media);
    }
        
}