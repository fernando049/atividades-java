import javax.swing.JOptionPane;

public class exercicio351 {
    public static void main(String[] args) {
        // Criando um vetor para armazenar os cinco nomes
        String[] nomes = new String[5];
        
        // Coletando os cinco nomes
        for (int i = 0; i < 5; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");
        }
        
        // Pedindo ao usuário para digitar o número correspondente a uma pessoa
        String numeroStr = JOptionPane.showInputDialog("Digite o número de 1 a 5 para selecionar uma pessoa:");
        int numero = Integer.parseInt(numeroStr);
        
        // Verificando se o número está dentro do intervalo válido (1 a 5)
        if (numero >= 1 && numero <= 5) {
            // Imprimindo o nome da pessoa correspondente
            JOptionPane.showMessageDialog(null, "A pessoa correspondente ao número " + numero + " é: " + nomes[numero - 1]);
        } else {
            // Caso o número seja inválido
            JOptionPane.showMessageDialog(null, "Número inválido. Digite um número entre 1 e 5.");
        }
    }

    
}
