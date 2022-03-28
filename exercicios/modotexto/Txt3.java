import java.util.Scanner;

class Txt3{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira a primeira variavel");
        int num1 = ler.nextInt();
        System.out.println("insira a segunda variavel");
        int num2 = ler.nextInt();
        int help;

        System.out.println("essa e a primeira variavel: " + num1 +"\n essa e a segunda variavel: " + num2);

        help = num1;
        num1 = num2;
        num2 = help; 
        System.out.println("------------------------------//-------------------------------------");
        System.out.println("agora essa e a primeira variavel: " + num1 +"\n e essa e a segunda variavel: " + num2);
        
    }        
}    