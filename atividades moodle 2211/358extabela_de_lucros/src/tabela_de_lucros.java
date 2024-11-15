import java.util.Scanner;

public class tabela_de_lucros {
    public static void main(String[] args) {
        int lucroMenor10 = 0, lucro10a20 = 0, lucroMaior20 = 0;
        try (Scanner scanner = new Scanner(System.in)) {

        for (int i = 0; i < 10; i++) { // Alterado de 100 para 10
            System.out.print("Digite o preço de compra: ");
            double precoCompra = scanner.nextDouble();
            System.out.print("Digite o preço de venda: ");
            double precoVenda = scanner.nextDouble();

            double lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;

            if (lucroPercentual < 10) {
                lucroMenor10++;
            } else if (lucroPercentual <= 20) {
                lucro10a20++;
            } else {
                lucroMaior20++;
                }
            }
        }

        System.out.println("Mercadorias com lucro < 10%: " + lucroMenor10);
        System.out.println("Mercadorias com 10% <= lucro <= 20%: " + lucro10a20);
        System.out.println("Mercadorias com lucro > 20%: " + lucroMaior20);
    }
}
