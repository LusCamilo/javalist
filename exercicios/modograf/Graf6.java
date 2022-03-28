import javax.swing.JOptionPane;

class Graf6{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();
        String Celcius00 = jop.showInputDialog(null, "insira a quantidade em °C");
        double celcius = Double.parseDouble(Celcius00);

        double fh = 9 * celcius + 160 / 5;

        jop.showMessageDialog(null, "valor em Fahrenheit: " + fh);
    }
}