import javax.swing.JOptionPane; //classe importada pq não estava disponivel

class TesteModoGra{
    
    public static void main(String args[]){
    JOptionPane jop = new JOptionPane(); //criar o objeto da classe

        String nascimento = jop.showInputDialog(null, "salve, digita o ano que voce nasceu"); //utilizar o metodo =)
        int ano = Integer.parseInt(nascimento);
        
        int idade = 2022 - ano;
        
        jop.showMessageDialog(null, "idade: " + idade);



              

    }
}