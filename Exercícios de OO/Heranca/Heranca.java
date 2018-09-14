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
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(10, "vira-lata", "Tobi");
        cachorro.comer();
        cachorro.dormir();
        cachorro.emitirSom();
        Gato gato = new Gato(5, "persa", "Garfield");
        gato.comer();
        gato.dormir();
        gato.emitirSom();
        Leao leao = new Leao(5, "sul-africano", "Simba");
        leao.emitirSom();
        Galinha galinha = new Galinha(1, "araucana", "pópó");
        galinha.emitirSom();
        
    }
    
}
