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
public class Galinha extends Animal{

    public Galinha(int idade, String raca, String nome) {
        super(idade, raca, nome);
    }
    
    public void emitirSom(){
        System.out.println(nome + " está cacarejando");
    }
}
