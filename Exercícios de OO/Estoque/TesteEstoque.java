/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaoo;

/**
 *
 * @author ice
 */
public class TesteEstoque {
    public static void main(String args[]){
        Estoque produto1 = new Estoque("Impressora Jato de tinta", 6 , 13);
        Estoque produto2 = new Estoque("Monitor LCD 17 polegadas", 13 , 11);
        Estoque produto3 = new Estoque("Mouse óptico", 2 , 6);
        Estoque produto4 = new Estoque("Notebook", 5 , 20);
        produto1.baixa(5);
        produto2.repor(7);
        produto3.baixa(4);
        produto1.imprimeDados();
        produto2.imprimeDados();
        produto3.imprimeDados();
        produto4.imprimeDados();
    }
}
