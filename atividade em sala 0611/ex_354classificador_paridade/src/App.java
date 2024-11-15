public class App {
    public static void main(String[] args) throws Exception {
        int[] NUM = {12, 7, 5, 18, 9, 10, 3, 6, 15, 2, 8, 11, 14, 1, 4};
        
        for (int i = 0; i < 15; i++) { 
            String paridade = (NUM[i] % 2 == 0) ? "par" : "ímpar";
            System.out.println((i + 1) + ": " + NUM[i] + " - " + paridade);
        }
    }
}
