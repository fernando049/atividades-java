import javax.swing.JOptionPane;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        // Lendo elementos para o primeiro conjunto
        String input = JOptionPane.showInputDialog("Digite 10 números para o primeiro conjunto (separados por vírgula):");
        for (String numStr : input.split(",")) {
            try {
                conjunto1.add(Integer.parseInt(numStr.trim()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite apenas números inteiros.");
            }
        }

        // Lendo elementos para o segundo conjunto
        input = JOptionPane.showInputDialog("Digite 20 números para o segundo conjunto (separados por vírgula):");
        for (String numStr : input.split(",")) {
            try {
                conjunto2.add(Integer.parseInt(numStr.trim()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite apenas números inteiros.");
            }
        }

        // Encontrando elementos comuns
        conjunto1.retainAll(conjunto2);

        // Mostrando os elementos comuns
        JOptionPane.showMessageDialog(null, "Elementos comuns: " + conjunto1.toString());
    }
}
