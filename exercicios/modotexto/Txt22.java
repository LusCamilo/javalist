import java.util.Scanner;

    class Txt22{
        public static void main(String args[]){
            Scanner ler = new Scanner(System.in);

             System.out.print ("digite o primeiro numero inteiro: ");
            int num1 = ler.nextInt();

            System.out.print ("digite o segundo numero inteiro: ");
            int num2 = ler.nextInt();

            int div = num1 / num2;

            System.out.println("esse e o resultado da divisao (mostrando a parte inteira inteiros):  " + div);
        }        
    }    