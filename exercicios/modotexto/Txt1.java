import java.util.Scanner;

class Txt1 {
    public static void main(String args[]){

    Scanner ler = new Scanner(System.in);
    //----------------------------------------------
    System.out.println ("digite o primeiro numero");
    double qnum1 = ler.nextDouble();
    //----------------------------------------------
    System.out.println ("digite o segundo numero");
    double qnum2 = ler.nextDouble();
    
    double som = qnum1 + qnum2;
    double sub = qnum1 - qnum2;
    double div = qnum1 / qnum2;
    double mul = qnum1 * qnum2;

    System.out.println ("\nesse e o resultado da soma: " + som);
    System.out.println ("\nesse e o resultado da subtracao: " + sub);
    System.out.println ("\nesse e o resultado da divisao: " + div);
    System.out.println ("\nesse e o resultado da multiplicacao: " + mul);
    }
}