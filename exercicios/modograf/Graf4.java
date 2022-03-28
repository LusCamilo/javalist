import javax.swing.JOptionPane;

class Graf4{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();
        String produto = jop.showInputDialog(null, "informe o valor do produto a ser pago");
        double vproduto = Double.parseDouble(produto);
        String porcentagem = jop.showInputDialog(null, "informe a porcentagem de desconto");
        double desconto = Double.parseDouble(porcentagem);

        double DescontoDoPro = vproduto * desconto / 100;
        
        jop.showMessageDialog(null, "esse e o seu desconto: " + DescontoDoPro);

        double valorfinal = vproduto - DescontoDoPro;

        jop.showMessageDialog(null, "esse e o preco do seu produto com desconto: " + valorfinal);

    }
}