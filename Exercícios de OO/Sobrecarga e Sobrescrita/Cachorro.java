/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

import sun.net.www.content.audio.aiff;

/**
 *
 * @author ice
 */
public class Cachorro extends Canino{

    public Cachorro(int idade, String raca, String nome) {
        super(idade, raca, nome);
    }

    public void emitirSom(){
        System.out.println(nome + " está latindo");
    }
    public boolean equals(Cachorro c1){
        return (this.nome.equals(c1.nome));
    }
}
