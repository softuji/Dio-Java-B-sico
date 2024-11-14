import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Insira o parametroUm: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Insira o parametroDois: ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidosException e){
            System.out.println("Ambos devem ser inteiros e o parametroDois deve ser maior que o parametroUm.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
            if(parametroDois < parametroUm)
                throw new ParametrosInvalidosException();

            else{
                int contagem = parametroDois - parametroUm;
                for(int i = 0; i < contagem; i ++){
                    System.out.println("Imprimindo o numero " + (i+1));
                }
            }
    }
}
