import javax.swing.JOptionPane;

public class HotelFazendaSucesso {
    // Dados básicos para cada quarto
    static String[] situacao = new String[50];
    static double[] despesasExtras = new double[50];
    static double[] precos = new double[50];

    public static void main(String[] args) {
        inicializarQuartos();  // Definindo quartos como "livres" e sem despesas inicialmente

        while (true) {
            String menu = """
                Hotel Fazenda Sucesso
                1. Cadastrar quartos
                2. Listar todos os quartos
                3. Listar quartos livres
                4. Alugar quarto
                5. Adicionar despesas extras
                6. Calcular despesas do quarto
                7. Sair
                Escolha uma opção:
                """;
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1 -> cadastrarQuartos();
                case 2 -> listarTodosQuartos();
                case 3 -> listarQuartosLivres();
                case 4 -> alugarQuarto();
                case 5 -> adicionarDespesasExtras();
                case 6 -> calcularDespesas();
                case 7 -> {
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);  // Finaliza o programa
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    public static void inicializarQuartos() {
        for (int i = 0; i < 50; i++) {
            situacao[i] = "Livre";
            precos[i] = 100.0;  // Preço padrão
            despesasExtras[i] = 0.0;
        }
    }

    public static void cadastrarQuartos() {
        for (int i = 0; i < 50; i++) {
            precos[i] = Double.parseDouble(JOptionPane.showInputDialog("Preço do quarto " + (i + 1) + ":"));
            situacao[i] = "Livre";
            despesasExtras[i] = 0.0;
        }
        JOptionPane.showMessageDialog(null, "Quartos cadastrados!");
    }

    public static void listarTodosQuartos() {
        StringBuilder info = new StringBuilder("Lista de Todos os Quartos:\n");
        for (int i = 0; i < 50; i++) {
            info.append("Quarto ").append(i + 1)
                .append(" - Situação: ").append(situacao[i])
                .append(" - Preço: R$").append(precos[i])
                .append(" - Despesas Extras: R$").append(despesasExtras[i])
                .append("\n");
        }
        JOptionPane.showMessageDialog(null, info.toString());
    }

    public static void listarQuartosLivres() {
        StringBuilder livres = new StringBuilder("Quartos Livres:\n");
        for (int i = 0; i < 50; i++) {
            if (situacao[i].equals("Livre")) {
                livres.append("Quarto ").append(i + 1).append(" - Preço: R$").append(precos[i]).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, livres.toString());
    }

    public static void alugarQuarto() {
        int quarto = Integer.parseInt(JOptionPane.showInputDialog("Número do quarto para alugar (1-50):")) - 1;
        if (quarto >= 0 && quarto < 50 && situacao[quarto].equals("Livre")) {
            situacao[quarto] = "Alugado";
            JOptionPane.showMessageDialog(null, "Quarto " + (quarto + 1) + " alugado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Quarto inválido ou já alugado.");
        }
    }

    public static void adicionarDespesasExtras() {
        int quarto = Integer.parseInt(JOptionPane.showInputDialog("Número do quarto para adicionar despesas (1-50):")) - 1;
        if (quarto >= 0 && quarto < 50 && situacao[quarto].equals("Alugado")) {
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da despesa extra:"));
            despesasExtras[quarto] += valor;
            JOptionPane.showMessageDialog(null, "Despesa adicionada ao quarto " + (quarto + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Quarto inválido ou não está alugado.");
        }
    }

    public static void calcularDespesas() {
        int quarto = Integer.parseInt(JOptionPane.showInputDialog("Número do quarto para calcular despesas (1-50):")) - 1;
        if (quarto >= 0 && quarto < 50 && situacao[quarto].equals("Alugado")) {
            double total = despesasExtras[quarto] + precos[quarto];
            JOptionPane.showMessageDialog(null, "Total a ser pago no quarto " + (quarto + 1) + ": R$ " + total);
            situacao[quarto] = "Livre";  // Libera o quarto após o pagamento
            despesasExtras[quarto] = 0.0;
        } else {
            JOptionPane.showMessageDialog(null, "Quarto inválido ou não está alugado.");
        }
    }
}
