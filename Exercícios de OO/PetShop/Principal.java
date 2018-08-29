/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;
import javax.swing.JOptionPane;

/**
 *
 * @author ice
 */
public class Principal {
    /*
    * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número máximo de cachorros que seu petshop pode acomodar:"));
        PetShop loja1 = new PetShop(n);
        int escolha, idade;
        String nome, raca;
        do{
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção: \n1 -> Comprar cachorro \n2 -> Vender cachorro \n3 -> Ver número de cachorros \nOutros valores -> Sair "));
            switch(escolha){
                case 1:
                   nome = JOptionPane.showInputDialog(null, "Digite o nome:");
                   raca = JOptionPane.showInputDialog(null, "Digite a raça:");
                   idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: "));
                   loja1.comprar(nome, raca, idade);
                   break;
                case 2:
                    nome = JOptionPane.showInputDialog(null, "Digite o nome: ");
                    loja1.vender(nome);
                    break;
                case 3: 
                    JOptionPane.showMessageDialog(null, "Número de cachorros " + loja1.getNumCachorros());
            }
        } while(escolha > 0 && escolha <= 3);
    }
}
