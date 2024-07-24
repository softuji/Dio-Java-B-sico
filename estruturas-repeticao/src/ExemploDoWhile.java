import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do{
            //executando repetidas vezes até alguem tocar
            System.out.println("Telefone tocando");
        }while (tocando());

        System.out.println("Alô!!!");
    }
    public static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;//se o numero gerado não for 1, continua false.
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
