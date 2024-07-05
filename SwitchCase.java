import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {
        String codigo = JOptionPane.showInputDialog(null, "Digite o código: ");

        switch (codigo) {
            case "001":
                JOptionPane.showMessageDialog(null, "Cerveja");
                break;

            case "002":
                JOptionPane.showMessageDialog(null, "Refrigerante");
                break;

            case "003":
                JOptionPane.showMessageDialog(null, "Suco");
                break;

            case "004":
                JOptionPane.showMessageDialog(null, "Vinho");
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "Código inválido, códigos existentes: 001, 002, 003, 004");
                break;
        }
    }
}
