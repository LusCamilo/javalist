import java.util.Scanner;

    class Txt21{
        public static void main(String args[]){
            Scanner ler = new Scanner(System.in);

            System.out.print ("digite o primeiro numero inteiro: ");
            int num1 = ler.nextInt();

            System.out.print ("digite o segundo numero inteiro: ");
            int num2 = ler.nextInt();

            double num1p = Math.pow (num1, 5);
            double num2p = Math.pow (num2, 5);

            System.out.println("esse e o valor da primeira potencia: " + num1p +"\n esse e o valor da segunda potencia: " + num2p);

            


        }
    }