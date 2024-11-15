import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> voos = new HashMap<>();

        // Leitura do número de voos e informações de cada voo
        System.out.print("Entre com o número de voos: ");
        int numVoos = scanner.nextInt();

        for (int i = 0; i < numVoos; i++) {
            System.out.print("Entre com a identificação do voo " + (i + 1) + ": ");
            String identificacao = scanner.next();
            System.out.print("Entre com a quantidade de lugares disponíveis no voo " + identificacao + ": ");
            int lugares = scanner.nextInt();
            voos.put(identificacao, lugares);
        }

        // Processamento de reservas
        while (true) {
            System.out.print("Entre com o número do voo desejado ou 0 para terminar: ");
            String vooDesejado = scanner.next();
            if (vooDesejado.equals("0")) {
                break;
            }

            if (voos.containsKey(vooDesejado)) {
                if (voos.get(vooDesejado) > 0) {
                    System.out.print("Qual o número da identidade do cliente? ");
                    String identidade = scanner.next();
                    voos.put(vooDesejado, voos.get(vooDesejado) - 1);
                    System.out.println("Identidade: " + identidade + ", Voo: " + vooDesejado);
                } else {
                    System.out.println("Não existem mais lugares neste voo.");
                }
            } else {
                System.out.println("Não existe este voo.");
            }
        }

        scanner.close();
    }
}