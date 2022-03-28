import java.util.Scanner;

class Txt4{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira o valor da compra");
        double valordacompra = ler.nextDouble();
        System.out.println("insira a porcertagem de desconto");
        int pordesconto = ler.nextInt();

        double descontodoproduto = valordacompra * pordesconto / 100;
        double valorfinal = valordacompra - descontodoproduto;

        System.out.println("esse e o valor do seu desconto: " + descontodoproduto + "\n");
        System.out.println("esse e o valor final do produto: " + valorfinal);
        



    }
}    