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
public class Gerente extends Funcionario {

    public Gerente(float salario, String nome, String matricula, int idade) {
        super(salario, nome, matricula, idade);
    }
    
    public void trabalhar(){ 
        System.out.println(nome + " está em reunião");
    }
}
