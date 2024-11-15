import javax.swing.JOptionPane;

public class SistemaNotas {
    public static void main(String[] args) {
        String[] nomes = new String[50];
        double[] nota1 = new double[50];
        double[] nota2 = new double[50];
        double[] media = new double[50];
        int numAlunos = 0;

        while (true) {
            String opcaoStr = JOptionPane.showInputDialog(null, "ESCOLA VIVA\n" +
                    "1 - Entrar nomes\n" +
                    "2 - Entrar 1ª nota\n" +
                    "3 - Entrar 2ª nota\n" +
                    "4 - Calcular média\n" +
                    "5 - Listar no display\n" +
                    "6 - Sair\n" +
                    "Digite a opção:");

            if (opcaoStr == null) {
                // Opção cancelada
                break;
            }

            int opcao = Integer.parseInt(opcaoStr);

            switch (opcao) {
                case 1:
                    String qtdAlunosStr = JOptionPane.showInputDialog(null, "Quantos alunos deseja cadastrar?");
                    numAlunos = Integer.parseInt(qtdAlunosStr);
                    for (int i = 0; i < numAlunos; i++) {
                        nomes[i] = JOptionPane.showInputDialog(null, "Nome do aluno " + (i + 1) + ": ");
                    }
                    break;
                case 2:
                    for (int i = 0; i < numAlunos; i++) {
                        String nota1Str = JOptionPane.showInputDialog(null, "Nota 1 do aluno " + nomes[i] + ": ");
                        nota1[i] = Double.parseDouble(nota1Str);
                    }
                    break;
                case 3:
                    for (int i = 0; i < numAlunos; i++) {
                        String nota2Str = JOptionPane.showInputDialog(null, "Nota 2 do aluno " + nomes[i] + ": ");
                        nota2[i] = Double.parseDouble(nota2Str);
                    }
                    break;
                case 4:
                    for (int i = 0; i < numAlunos; i++) {
                        media[i] = (nota1[i] * 3 + nota2[i] * 7) / 10;
                    }
                    JOptionPane.showMessageDialog(null, "Médias calculadas.");
                    break;
                case 5:
                    String resultado = "";
                    for (int i = 0; i < numAlunos; i++) {
                        resultado += "Aluno: " + nomes[i] + "\n";
                        resultado += "Nota 1: " + nota1[i] + "\n";
                        resultado += "Nota 2: " + nota2[i] + "\n";
                        resultado += "Média: " + media[i] + "\n\n";
                    }
                    JOptionPane.showMessageDialog(null, resultado, "Listagem de Alunos e Médias", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}