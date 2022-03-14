import javax.swing.*;
class Main{
    public static void main(String[ ] args){
        String nome;
        Pato c = new patoVoador();
        nome = c.nome();

        c = new patoDeMadeira();
        nome += c.nome();

        c = new patoDeBorracha();
        nome += c.nome();

        c = new patoNormal();
        nome += c.nome();

        JOptionPane.showMessageDialog(null,nome, "Implements",1);
    }
}