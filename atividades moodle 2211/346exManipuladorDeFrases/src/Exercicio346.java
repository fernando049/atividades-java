import javax.swing.JOptionPane;

public class Exercicio346 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase:");

        int opcao = -1;
        do {
            String menu = "Menu:\n"
                    + "1. Imprimir o comprimento da frase.\n"
                    + "2. Imprimir os dois primeiros e dois últimos caracteres.\n"
                    + "3. Imprimir a frase espelhada.\n"
                    + "4. Todas as opções anteriores.\n"
                    + "5. Sair.\n"
                    + "Escolha uma opção:";

            String input = JOptionPane.showInputDialog(menu);
            if (input == null) {
                break; // Encerra se o usuário fechar o diálogo
            }

            try {
                opcao = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira um número.");
                continue;
            }

            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Comprimento: " + frase.length());
                    break;
                case 2:
                    if (frase.length() >= 2) {
                        JOptionPane.showMessageDialog(null, "Primeiros 2: " + frase.substring(0, 2)
                                + "\nÚltimos 2: " + frase.substring(frase.length() - 2));
                    } else {
                        JOptionPane.showMessageDialog(null, "A frase é muito curta.");
                    }
                    break;
                case 3:
                    StringBuilder espelhada = new StringBuilder(frase).reverse();
                    JOptionPane.showMessageDialog(null, "Frase espelhada: " + espelhada);
                    break;
                case 4:
                    // Executa todas as opções anteriores
                    StringBuilder resultado = new StringBuilder();
                    resultado.append("Comprimento: ").append(frase.length()).append("\n");

                    if (frase.length() >= 2) {
                        resultado.append("Primeiros 2: ").append(frase.substring(0, 2)).append("\n");
                        resultado.append("Últimos 2: ").append(frase.substring(frase.length() - 2)).append("\n");
                    } else {
                        resultado.append("A frase é muito curta.\n");
                    }
                    resultado.append("Frase espelhada: ").append(new StringBuilder(frase).reverse());

                    JOptionPane.showMessageDialog(null, resultado.toString());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Programa finalizado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 5);
    }
}
