import java.util.Arrays;
import javax.swing.JOptionPane;

public class gestor_estoque_queijos {
    public static void main(String[] args) {
        int[] codigos = new int[50];
        int[] quantidades = new int[50];
        double[] precos = new double[50];
        int k = 0;
        double totalVendas = 0.0;

        while (k < 50) {
            String codigoStr = JOptionPane.showInputDialog("Digite o código do produto ou -1 para encerrar:");
            int codigo = Integer.parseInt(codigoStr);
            if (codigo == -1) break;

            codigos[k] = codigo;
            String quantidadeStr = JOptionPane.showInputDialog("Digite a quantidade em estoque:");
            quantidades[k] = Integer.parseInt(quantidadeStr);
            String precoStr = JOptionPane.showInputDialog("Digite o preço do produto:");
            precos[k] = Double.parseDouble(precoStr);
            k++;
        }

        while (true) {
            String codigoVendaStr = JOptionPane.showInputDialog("Digite o código do produto para venda ou 0 para encerrar:");
            int codigoVenda = Integer.parseInt(codigoVendaStr);
            if (codigoVenda == 0) break;

            int index = Arrays.binarySearch(codigos, 0, k, codigoVenda);
            if (index < 0) {
                JOptionPane.showMessageDialog(null, "Produto não cadastrado.");
                continue;
            }

            String quantidadeVendaStr = JOptionPane.showInputDialog("Digite a quantidade a ser vendida:");
            int quantidadeVenda = Integer.parseInt(quantidadeVendaStr);

            if (quantidades[index] >= quantidadeVenda) {
                quantidades[index] -= quantidadeVenda;
                double valorVenda = quantidadeVenda * precos[index];
                totalVendas += valorVenda;
                JOptionPane.showMessageDialog(null, "Venda realizada. Valor: " + valorVenda);
            } else {
                JOptionPane.showMessageDialog(null, "Estoque insuficiente.");
            }
        }

        JOptionPane.showMessageDialog(null, "Total vendido no dia: " + totalVendas);
    }
}
