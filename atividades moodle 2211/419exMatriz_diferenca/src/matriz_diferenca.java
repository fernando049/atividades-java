
import java.util.Scanner;

public class matriz_diferenca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[5][5];
        int[][] matrizB = new int[5][5];
        int[][] matrizDiferenca = new int[5][5];

        System.out.println("Digite os valores para a matriz A:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os valores para a matriz B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz Diferença:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizDiferenca[i][j] = matrizA[i][j] - matrizB[i][j];
                System.out.print(matrizDiferenca[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
