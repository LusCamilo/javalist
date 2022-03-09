import javax.swing.JOptionPane;

class Graf24{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();
        String pnum1 = jop.showInputDialog(null, "digite um numero");
        int num1 = Integer.parseInt(pnum1);
        String pnum2 = jop.showInputDialog(null, "digite um segundo numero");
        int num2 = Integer.parseInt(pnum2);

        double rnum1 = Math.sqrt(num1);
        double rnum2 = Math.sqrt(num2);

        jop.showMessageDialog(null, "esse e o resultado do primeiro numero: " + rnum1);
        jop.showMessageDialog(null, "esse e o resultado do segundo numero: " + rnum2);

    }
}