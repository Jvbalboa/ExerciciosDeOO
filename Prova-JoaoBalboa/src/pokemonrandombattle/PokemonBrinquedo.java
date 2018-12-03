/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonrandombattle;

import javax.swing.JOptionPane;

/**
 *
 * @author João Victor Dutra Balboa
 * Essa classe tem um atributo do tipo Pokemon, pois este é lido do arquivo, 
 * portanto ele deve ser inicializado antes que os valores de pokemonBrinquedo sejam inseridos.
 * Só assim seria possível acessar o nome dos Pokemons (instanciando um deles).
 */
public class PokemonBrinquedo {
    private int id;//Id do pokemon de brinquedo (o mesmo do pokemon de batalha correspondente)
    private String nome;
    private float preco;
    String som;
    Pokemon p;

    public PokemonBrinquedo(int id) {
        this.id = id;
        p = Dados.pokemons.get(id-1);
        preco = p.getHp(); //O preço de cada Pokemon é igual a seu HP, assim, pokemons com HP melhor serão mais caros
        this.nome = p.getNome();
        som = nome + nome;
        
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public float getPreco() {
        return preco;
    }
    
    
    public void emitirSom(){
        JOptionPane.showMessageDialog(null,"Emitindo som", "O Pokemon " + this.nome + "está emitindo som: " + this.som, 0);
    }
    
    
    
    
}
