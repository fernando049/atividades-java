import java.util.Scanner;

public class TransformaTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        System.out.print("Digite o caractere a ser substituído: ");
        char caractere = scanner.next().charAt(0);

        ProcessadorTexto processador = new ProcessadorTexto(palavra, caractere);

        System.out.println("Palavra modificada: " + processador.getPalavraModificada());
        System.out.println("Total de caracteres substituídos: " + processador.getTotalSubstituidos());

        scanner.close();
    }
}
