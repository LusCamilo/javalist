import javax.swing.JOptionPane;

class Graf5{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();
        String valordodolar = jop.showInputDialog(null, "diga o valor do dolar atualmente ");
        double dolar = Double.parseDouble(valordodolar);
        String reais = jop.showInputDialog(null, "diga para quantos reais voce quer transformar o dolar ");
        double real = Double.parseDouble(reais);

        double ValorEmReais = dolar * real;

        jop.showMessageDialog(null, "esse e o valor do seu dinheiro em reais: " + ValorEmReais);
        

    }
}