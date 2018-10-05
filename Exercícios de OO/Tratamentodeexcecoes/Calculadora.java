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
public class Calculadora {
    
    public static float Divisao(int a, int b){
        float c = 0;
        try {
            c =  a/b;
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return c;
    }
    
    public static void vetor(){
        int []vet = new int[2];
        try {
            for(int i=0; i<3; i++)
                vet[i]+=i;
        } catch (Exception e) {
            String erro = e.toString();
            erro = erro.replace('.',';');
            String[] mensagemDeErro = erro.split(";");
            System.out.println("Erro: " + mensagemDeErro[(mensagemDeErro.length)-1]);
        }
    }
}
