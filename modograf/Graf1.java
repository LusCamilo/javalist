import javax.swing.JOptionPane;

class Graf1{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();
        String pnum1 = jop.showInputDialog(null,"digite o primeiro numero");
        double num1 = Double.parseDouble(pnum1);
        String pnum2 = jop.showInputDialog(null, "digite o segundo numero");
        double num2 = Double.parseDouble(pnum2);

        double som = num1 + num2; 
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;

        jop.showMessageDialog(null,"\nesse e o resultado da soma: " + som); 
        jop.showMessageDialog(null,"\nesse e o resultado da subtracao: " + sub);
        jop.showMessageDialog(null,"\nesse e o resultado da divisao: " + div);
        jop.showMessageDialog(null,"\nesse e o resultado da multiplicacao: " + mul);
//-------------------------------------------------------------------------------------------
    }
}