import javax.swing.JOptionPane;

    class Graf3{
        public static void main(String args[]){
            JOptionPane jop = new JOptionPane();
            String pnum1 = jop.showInputDialog(null, "digite a primeira variavel");
            int val1 = Integer.parseInt(pnum1);
            String pnum2 = jop.showInputDialog(null, "digite a segunda variavel");
            int val2 = Integer.parseInt(pnum2);
            jop.showMessageDialog (null, "aqui ficara a variavel de ajuda 'help'");
            int help;

           help = val1;
           val1 = val2;
           val2 = help;

            jop.showMessageDialog (null, "variavel 1: " + val1 + "\n variavel 2: " + val2);
        }
    }