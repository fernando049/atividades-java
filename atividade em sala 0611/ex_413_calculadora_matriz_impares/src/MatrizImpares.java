import javax.swing.*;
import java.awt.*;

public class MatrizImpares {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Lendo os valores da matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String valor = JOptionPane.showInputDialog("Digite o valor para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = Integer.parseInt(valor);
            }
        }

        // Calculando a soma dos quadrados dos números ímpares abaixo da diagonal secundária
        int somaQuadradosImpares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    somaQuadradosImpares += matriz[i][j] * matriz[i][j];
                }
            }
        }

        // Calculando a raiz quadrada
        double raizQuadrada = Math.sqrt(somaQuadradosImpares);

        // Exibindo a matriz e o resultado
        String matrizString = "";
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                matrizString += elemento + " ";
            }
            matrizString += "\n";
        }

        JOptionPane.showMessageDialog(null, "Matriz:\n" + matrizString + "\nRaiz quadrada da soma dos quadrados dos números ímpares abaixo da diagonal secundária: " + raizQuadrada);
    }
}