
import javax.swing.JOptionPane;

class Graf21{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();
        String pnum1 = jop.showInputDialog(null,"digite o primeiro numero");
        double num1 = Double.parseDouble(pnum1);
        String pnum2 = jop.showInputDialog(null, "digite o segundo numero");
        double num2 = Double.parseDouble(pnum2);

        double renum1 = Math.pow (num1 , 5);
        double renum2 = Math.pow (num2 , 5);

        jop.showMessageDialog(null, "esse e o resultado do primeiro numero: " + renum1 );
        jop.showMessageDialog(null, "esse e o resultado do seundo numero: " + renum2);
//------------------------------------------------------------------------------------------

    }
}

    