import java.util.Scanner;

class Txt24{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira o primeiro radicando");
        int num1 = ler.nextInt();
        System.out.println("insira o segundo");
        int num2 = ler.nextInt();

        double raiz1 = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2);

        System.out.println("esse e o resultado da primeira raiz: " + raiz1+"\n esse e o resultado da segunda raiz: " + raiz2);

    }
}