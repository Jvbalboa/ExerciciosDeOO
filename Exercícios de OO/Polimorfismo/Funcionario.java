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
public abstract class Funcionario {
    protected float salario;
    protected String nome, matricula;
    protected int idade;
 
    public Funcionario(float salario, String nome, String matricula, int idade) {
        this.salario = salario;
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }
    
    public void trabalhar(){ 
        System.out.println(nome + " está trabalhando");
    }
    
}
