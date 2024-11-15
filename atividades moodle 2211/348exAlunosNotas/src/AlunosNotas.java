import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AlunosNotas {
    public static void main(String[] args) {
        // Criando arrays para armazenar os dados dos alunos
        String[] nomes = new String[5];
        double[] nota1 = new double[5];
        double[] nota2 = new double[5];
        
        // Coletando os dados dos 5 alunos
        for (int i = 0; i < 5; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ":");
            
            String nota1Str = JOptionPane.showInputDialog("Digite a primeira nota do aluno " + (i + 1) + ":");
            nota1[i] = Double.parseDouble(nota1Str);
            
            String nota2Str = JOptionPane.showInputDialog("Digite a segunda nota do aluno " + (i + 1) + ":");
            nota2[i] = Double.parseDouble(nota2Str);
        }
        
        // Criação do modelo da tabela
        String[] colunas = {"Nome", "Nota 1", "Nota 2", "Média"};
        Object[][] dados = new Object[5][4];
        
        // Preenchendo os dados da tabela com o nome e as notas dos alunos
        for (int i = 0; i < 5; i++) {
            double media = (nota1[i] + nota2[i]) / 2;
            dados[i][0] = nomes[i];  // Nome
            dados[i][1] = nota1[i];  // Nota 1
            dados[i][2] = nota2[i];  // Nota 2
            dados[i][3] = media;     // Média
        }
        
        // Criando o modelo da tabela com os dados
        DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas);
        JTable tabela = new JTable(modeloTabela);
        
        // Criando um JScrollPane para adicionar a tabela nele e permitir a rolagem
        JScrollPane scrollPane = new JScrollPane(tabela);
        
        // Exibindo a tabela em uma janela de diálogo
        JOptionPane.showMessageDialog(null, scrollPane, "Listagem de Notas e Médias dos Alunos", JOptionPane.INFORMATION_MESSAGE);
    }
}
