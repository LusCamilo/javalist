import javax.swing.JOptionPane;

class Graf22{
    public static void main (String args[]){
        JOptionPane jop = new JOptionPane();
        jop.showMessageDialog(null, "ola seja bem-vindo leo");
        String pnum1 = jop.showInputDialog( null, "escreve um numero");
        int num1 = Integer.parseInt(pnum1);
        String pnum2 = jop.showInputDialog(null, "escreve outro numero" );
        int num2 = Integer.parseInt(pnum2);
        jop.showMessageDialog(null, "PARABENS leo VC SABE LER");
        
        int res = num1 / num2;
        jop.showMessageDialog(null, "aqui e o resultado leo " + res);
        jop.showMessageDialog(null, "aprende a fazer conta leo");
    }
}