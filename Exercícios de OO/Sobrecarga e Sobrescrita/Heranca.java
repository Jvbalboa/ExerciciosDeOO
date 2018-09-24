/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

import java.util.ArrayList;

/**
 *
 * @author ice
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Cachorro cachorro = new Cachorro(10, "vira-lata", "Tobi");
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
        galinha.emitirSom();/*
        */
        ArrayList<Animal> animais = new ArrayList<Animal>();
        animais.add(new Cachorro(10, "vira-lata", "Tobi"));
        animais.add(new Gato(3, "persa", "Garfield"));
        animais.add(new Galinha(3, "araucana", "pópó"));
        for(int i=0; i<animais.size(); i++)
            animais.get(i).emitirSom();
        Cachorro c1 = new Cachorro(3, "vira-lata", "Tobi");
        Cachorro c2 = new Cachorro(4, "pitbull", "Tobi");
        System.out.println(c1.equals((c2)));
        System.out.println(c1.toString());
    }
    
}
