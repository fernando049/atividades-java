import java.util.Scanner;
import javax.swing.JOptionPane;

public class descubridor_de_signos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ultDia = {20, 19, 20, 20, 21, 21, 22, 22, 22, 22, 21, 21};
        String[] signos = {"Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário"};

        while (true) {
            String diaStr = JOptionPane.showInputDialog("Digite o dia ou 99 para terminar:");
            int dia = Integer.parseInt(diaStr);
            if (dia == 99) break;

            String mesStr = JOptionPane.showInputDialog("Digite o mês:");
            int mes = Integer.parseInt(mesStr) - 1;
            if (mes < 0 || mes > 11) {
                JOptionPane.showMessageDialog(null, "Mês inválido. Tente novamente.");
                continue;
            }
            if (dia > ultDia[mes]) {
                mes = (mes + 1) % 12;
            }
            JOptionPane.showMessageDialog(null, "Signo: " + signos[mes]);
        }
        scanner.close();
    }
}
