import javax.swing.JOptionPane;

public class AumentoSalarial {
    public static void main(String[] args){
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Salário: ")), bonus;
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Tempo de empresa em anos: "));

        if (tempo >= 5) {
            bonus = salario * 0.20f;
        } else {
            bonus = salario * 0.10f;
        }

        JOptionPane.showMessageDialog(null, "O valor do bônus é: R$" + bonus);
    }
}