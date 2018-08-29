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
public class Main {
     public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.imprimirEstado();
        Funcionario funcionario2 = new Funcionario("José", 30);
        funcionario2.imprimirEstado();
        Funcionario funcionario3 = new Funcionario("Maria", "2015A01", 30);
        funcionario3.imprimirEstado();
        System.out.println("Número de funcionários: " + funcionario1.getNumFuncionarios());
    }
}
