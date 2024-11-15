import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GestaoNotasAlunos {
    public static void main(String[] args) {
        // Definir o número de alunos
        final int NUM_ALUNOS = 15;
        
        // Vetores para armazenar os nomes, notas e resultados
        String[] nomes = new String[NUM_ALUNOS];
        double[] pr1 = new double[NUM_ALUNOS];
        double[] pr2 = new double[NUM_ALUNOS];
        double[] medias = new double[NUM_ALUNOS];
        String[] situacoes = new String[NUM_ALUNOS];
        
        // Coletando dados dos alunos
        for (int i = 0; i < NUM_ALUNOS; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ":");
            
            String pr1Str = JOptionPane.showInputDialog("Digite a nota da PR1 do aluno " + (i + 1) + ":");
            pr1[i] = Double.parseDouble(pr1Str);
            
            String pr2Str = JOptionPane.showInputDialog("Digite a nota da PR2 do aluno " + (i + 1) + ":");
            pr2[i] = Double.parseDouble(pr2Str);
            
            // Calculando a média e arredondando
            medias[i] = Math.round((pr1[i] + pr2[i]) / 2);
            
            // Definindo a situação do aluno
            if (medias[i] >= 6) {
                situacoes[i] = "AP";  // Aprovado
            } else {
                situacoes[i] = "RP";  // Reprovado
            }
        }

        // Criando os dados para a tabela
        String[] colunas = {"Nome", "PR1", "PR2", "Média", "Situação"};
        Object[][] dados = new Object[NUM_ALUNOS][5];
        
        // Preenchendo os dados da tabela com o nome, as notas, a média e a situação
        for (int i = 0; i < NUM_ALUNOS; i++) {
            dados[i][0] = nomes[i];  // Nome
            dados[i][1] = pr1[i];    // Nota PR1
            dados[i][2] = pr2[i];    // Nota PR2
            dados[i][3] = medias[i]; // Média
            dados[i][4] = situacoes[i]; // Situação
        }
        
        // Criando o modelo da tabela com os dados e colunas
        DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas);
        JTable tabela = new JTable(modeloTabela);
        
        // Criando um JScrollPane para adicionar a tabela nele e permitir a rolagem
        JScrollPane scrollPane = new JScrollPane(tabela);
        
        // Exibindo a tabela em uma janela de diálogo
        JOptionPane.showMessageDialog(null, scrollPane, "Listagem de Notas e Situação dos Alunos", JOptionPane.INFORMATION_MESSAGE);
    }
}
