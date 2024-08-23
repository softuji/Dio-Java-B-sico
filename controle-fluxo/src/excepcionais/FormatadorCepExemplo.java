public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("12345678"); //exigencia do try/catch por ser Exception
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negocio.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();

            return "12.345-678"; //exemplo de formato
    }
    
}
