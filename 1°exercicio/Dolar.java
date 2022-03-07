import java.util.Scanner;
class Dolar{
    public static void main(String args[]){
    double valordolar = 5.16;
    Scanner vezes = new Scanner(System.in);
         double quantidade;
         System.out.println ( "quantos dolares voce quer transformar em real?");
         quantidade = vezes.nextDouble();
         double valorfinal = valordolar * quantidade;
         System.out.println ("esse e o valor em reais da sua quantia em dolar"+ valorfinal);
    } 
}