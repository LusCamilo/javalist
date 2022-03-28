import javax.swing.JOptionPane;

class Graf23{
    public static void main(String args[]){
     JOptionPane jop = new JOptionPane();
     String pnum1 = jop.showInputDialog (null, "digite um numero");
     int num1 = Integer.parseInt(pnum1);
     String pnum2 = jop.showInputDialog (null, "digite outro numero");
     int num2 = Integer.parseInt(pnum2);

     int res = num1 % num2;
     jop.showMessageDialog(null, "esse e o restante " + res);
    }
}