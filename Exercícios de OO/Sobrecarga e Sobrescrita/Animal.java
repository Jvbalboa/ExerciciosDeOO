/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author ice
 */
public abstract class Animal {
    private int idade;
    private String raca;
    protected String nome;

    public Animal(){}
    
    public Animal(int idade, String raca, String nome) {
        this.idade = idade;
        this.raca = raca;
        this.nome = nome;
    }
    
    public void comer(){
        System.out.println(nome + " está comendo");
    }
    
    public void dormir(){
        System.out.println(nome + " está dormindo");
    }

    public String getNome() {
        return nome;
    }
    
    public String toString(){
        return this.getNome();
    }
    
    public abstract void emitirSom();
}
