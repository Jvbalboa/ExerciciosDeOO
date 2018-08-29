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
public class PetShop {
    private int numCachorros, numMax;
    Cachorro cachorros[];
    
    public PetShop(int numMax){
        cachorros = new Cachorro[numMax];
        this.numMax = numMax;
        numCachorros = 0;
    }

    public int getNumCachorros() {
        return numCachorros;
    }
    
    public void vender(String nome) {
        int i;
        boolean achou = false;
        for(i = 0; i < numCachorros; i++)
            if(cachorros[i].getNome().equals(nome)){
                cachorros[i] = null;
                achou = true;
                numCachorros--;
            }
        for(int j = i; j < numCachorros-1; j++)
            cachorros[i] = cachorros[i+1];
        if(!achou)
            JOptionPane.showMessageDialog(null, "Erro! Cachorro inexistente");
        
    }
    
    public void comprar(String nome, String raca, int idade){
        if(numCachorros < numMax){
            cachorros[numCachorros] = new Cachorro();
            cachorros[numCachorros].setNome(nome);
            cachorros[numCachorros].setRaca(raca);
            cachorros[numCachorros].setIdade(idade);
            numCachorros++;
        }
        else
            JOptionPane.showMessageDialog(null, "Erro! Número máximo atingido");
    }
}

