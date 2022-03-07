class Porcen{
    public static void main(String args[]){
        double original = 599.99;
        int desconto =  30;
        double comdesconto = original * desconto /100;
        System.out.println();
        System.out.println("esse e o seu desconto: " + comdesconto);
        System.out.println("-----------------------------------");
        double valorfinal = original - comdesconto;
        System.out.println("esse e o valor a ser pago: " + valorfinal);
        

    }
}