/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author JV
 */
public class Funcionario {
    
    private String nome, matricula, cargo;
    private int idade;
    private float salario;
    private static int numFuncionarios;

    public Funcionario(){
        salario = 1500;
        numFuncionarios ++;
    }

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        numFuncionarios ++;
    }

    public Funcionario(String nome, String matricula, float salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        numFuncionarios ++;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }
    
    public void imprimirEstado(){
        System.out.println("Nome: " + nome + "\nMatrícula: " + matricula + "\nIdade: " + idade + "\nCargo: " + cargo + "\nSalário: " + salario);
    }
}
