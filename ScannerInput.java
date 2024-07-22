import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome;

        System.out.printf("Digite seu nome: ");
        nome = leitura.nextLine();

        System.out.printf("Seu nome é %s\n", nome);
    }
}