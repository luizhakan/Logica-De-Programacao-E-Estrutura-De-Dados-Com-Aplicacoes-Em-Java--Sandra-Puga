import javax.swing.JOptionPane;

class Matriz {
    public static void main(String[] args){
        int escolha1, escolha2;

        String matriz[][] = {
            {
                "Luiz", "Safira", "Lucas"
            },
            {
                "Sandra", "Ryan", "Placido"
            }
        };
        
        JOptionPane.showMessageDialog(null, "Você tem uma matriz com duas dimensões.");
        JOptionPane.showMessageDialog(null, "A primeira vai de 0 a 1.");
        JOptionPane.showMessageDialog(null, "A segunda vai de 0 a 2.");

        escolha1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção para o primeiro indice da matriz."));
        escolha2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção para o segundo indice da matriz."));

        JOptionPane.showMessageDialog(null, matriz[escolha1][escolha2]);
    }
}