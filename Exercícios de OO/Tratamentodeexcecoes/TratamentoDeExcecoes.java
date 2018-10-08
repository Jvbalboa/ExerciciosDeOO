/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentodeexcecoes;

/**
 *
 * @author ice
 */
public class TratamentoDeExcecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Divisão: " + Calculadora.Divisao(5, 0));
        Calculadora.vetor();
        Arquivo.abrirArquivoComTry();
        Arquivo.abrirArquivoComThrow();
        AulaOO.chegarNaAula(20);
    }
    
}
