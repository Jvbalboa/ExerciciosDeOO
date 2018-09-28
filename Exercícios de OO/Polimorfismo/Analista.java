/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author ice
 */
public class Analista extends Funcionario{
    private String chefe;
    
    public Analista(float salario, String nome, String matricula, int idade) {
        super(salario, nome, matricula, idade);
    }
    
    public void trabalhar(){ 
        System.out.println(nome + " está documentando");
    }
    
    public void trabalhar(String oq){ 
        System.out.println(nome + " está documentando um(a) " + oq);
    }
    
}
