public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        
        System.out.println(++numero); //difere de numero ++ pela precedencia e sairá 5.
        System.out.println(numero);

        boolean variavel = true;

        System.out.println(!variavel);//resulta em false momentaneamente

        variavel = !variavel; 
        System.out.println(variavel);

        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso"; //operador ternário comporta como IF (verifica a validade da afirmação)
        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;

        System.out.println("numero1é igual a numero2? " + simNao);

        String nome1 = "Sofia";
        String nome2 = new String("Sofia"); //novo objeto
        
        System.out.println(nome1 == nome2); //válido para números
        System.out.println(nome1.equals(nome2)); //textos e objetos (compara conteúdos)

        boolean condicao1 = true;
        boolean condicao2 = false;
        if (condicao1 || condicao2)
            System.out.println("Uma das alternativas é verdadeira.");
        
    }
}
