public class ProcessadorTexto {
    private final String palavraOriginal;
    private final char caractereSubstituir;
    private final String palavraModificada;
    private final int totalSubstituidos;

    public ProcessadorTexto(String palavraOriginal, char caractereSubstituir) {
        this.palavraOriginal = palavraOriginal;
        this.caractereSubstituir = caractereSubstituir;
        this.palavraModificada = processarTexto();
        this.totalSubstituidos = contarSubstituicoes();
    }

    private String processarTexto() {
        StringBuilder modificada = new StringBuilder();
        for (char c : palavraOriginal.toCharArray()) {
            modificada.append(c == caractereSubstituir ? '*' : c);
        }
        return modificada.toString();
    }

    private int contarSubstituicoes() {
        return (int) palavraOriginal.chars().filter(c -> c == caractereSubstituir).count();
    }

    
    public String getPalavraModificada() {
        return palavraModificada;
    }

    public int getTotalSubstituidos() {
        return totalSubstituidos;
    }
}
