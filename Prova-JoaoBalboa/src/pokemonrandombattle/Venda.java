/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonrandombattle;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Essa classe controla as vendas dos Pokemons
 * @author João Victor Dutra Balboa
 */
public class Venda {
    private float total; //total da venda
    private PokemonBrinquedo poke1;
    ArrayList<String> colecao = new ArrayList(); //Array de Pokemons vendidos (salva seu nome)

    public Venda() {
        total = 0;
    }
    
    
    
    /**
     * Método que efetua a venda
     * 
     */
    public void vender(){
        int id; //Id do pokemon
        int qtd; //Quantidade de pokemons que se quer comprar
        int escolha = 1;//Auxiliar que controla o fim da venda 
        boolean existe = false;//Auxiliar que controla se aquele pokemon já foi comparado 
        String nomeAux;
        do {
            id = Integer.parseInt(JOptionPane.showInputDialog("Escolha a ID do pokemon"));
            try{
                qtd = Integer.parseInt(JOptionPane.showInputDialog("Escolha a quantidade"));
                if(qtd < 0)
                    throw new ValorInvalidoException("Quantidade negativa");
            }
            catch(ValorInvalidoException e){
                JOptionPane.showMessageDialog(null,"ERRO", e.getMessage() ,1);
                qtd = 0;
            }
            poke1 = new PokemonBrinquedo(id);
            total = total + (poke1.getPreco() * qtd);
           
            colecao.add(poke1.getNome());
            do{
               escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"Total: " + total + "\nDigite: \n1 -> Continuar comprando \n0 -> Sair")); 
            } while(escolha != 0 && escolha != 1);
        } while(escolha == 1);
        //Grava a venda no arquivo
        FileWriter arq;
        try {
            arq = new FileWriter("Venda.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            for(int i=0; i<colecao.size(); i++)
                gravarArq.printf("%d - %s \n", i+1, colecao.get(i));
            gravarArq.printf("Total: %.2f ", total);
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
