package condicional;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7)
            System.out.println("Aprovado");//Condicional simples

        else if(nota >= 5 && nota < 7)
            System.out.println("Recuperação");//Condicional encadeada

        else
            System.out.println("Reprovado");//Condicional composta
    }
}
