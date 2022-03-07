
class Variaveistrocadas{
    public static void main(String args[]){
        int n1 = 10;
        int n2= 4;
        System.out.println ("primeira variavel " +n1);
        System.out.println ("segunda variavel " +n2);
        System.out.println ();
        System.out.println ("agora vamos trocar as variaveis :) ");
         System.out.println ();

        int help = n1;
        n1 = n2;
        n2 = help;
        System.out.println ("primeira variavel " +n1);
        System.out.println ("segunda variavel " +n2);
    }
}