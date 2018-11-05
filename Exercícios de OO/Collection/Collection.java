/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ice
 */
public class Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa("Jose", 19);
        Pessoa p2 = new Pessoa("Joao", 20);
        Pessoa p3 = new Pessoa("Maria", 15);
        List<Pessoa> lista = new ArrayList();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        System.out.println("lista: " + lista);
        Collections.sort(lista);
        System.out.println("Ordenada por nome: " + lista);
        Collections.sort(lista, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa o1, Pessoa o2){
                return o1.getIdade()-(o2.getIdade());
            }
        });
        System.out.println("Ordenada por idade: " + lista);
    }
    
}
