/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author ice
 */
public class Cachorro {
    private String raca, nome;
    private int idade;

    public Cachorro(){
        
    }
    
    public Cachorro(String nome, String raca, int idade) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void aumentaIdade() {
        idade++;
    }
    
    
}
