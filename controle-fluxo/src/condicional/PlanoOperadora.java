package condicional;
//Condicional Switch Case como complementar, acumulativo, ordem decrescente
public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "A";

        switch (plano) {
            default:
                System.out.println("Escolha entre B, M ou T");
                break;
            case "T":
                System.out.println("5Gb Youtube");

            case "M":
                System.out.println("Whats e Instagram Grátis");
            
            case "B":
                System.out.println("100 minutos de ligação");

        }
    }
}
