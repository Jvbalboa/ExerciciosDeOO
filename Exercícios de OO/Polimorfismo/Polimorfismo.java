/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author ice
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Programador(3500, "John", "2017A01", 27));
        funcionarios.add(new Gerente(8000, "Steve", "2015C09", 42));
        funcionarios.add(new Analista(3500, "Michael", "2015C09", 42));
        for(int i=0; i<funcionarios.size(); i++)
            funcionarios.get(i).trabalhar();
        Programador p1 = new Programador(2000, "José", "2018A15", 23);
        p1.trabalhar(6);
        Analista a1 = new Analista(2000, "Maria", "2018A16", 24);
        a1.trabalhar("sitema");
    }
    
}
