import javax.swing.JOptionPane;

public class Nome {
	public static void main(String[] args){
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		String nomeCapitalizado = toTitledCase(nome);
		JOptionPane.showMessageDialog(null, "Seu nome é: " + nomeCapitalizado);
	}

	public static String toTitledCase(String str){
		String[] words = str.split("\\s");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase());
			sb.append(" ");
		}
		return sb.toString().trim();
	}
}
