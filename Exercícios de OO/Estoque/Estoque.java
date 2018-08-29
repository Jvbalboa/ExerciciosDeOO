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
public class Estoque {
    private String nome;
    private int qtdAtual, qtdMinima;
    private void verificaEstoque(){
        if(qtdAtual < qtdMinima)
            System.out.println("ATENÇÃO! O produto " + nome + " está com quantidade baixa em estoque, deve-se repor o mais rápido possível");
    }

    public Estoque(String nome, int qtdMinima, int qtdAtual) {
        do {            
            this.nome = nome;
            this.qtdMinima = qtdMinima;
            this.qtdAtual = qtdAtual;
        } while (qtdAtual < 0 || qtdMinima < 0 );      
        verificaEstoque();
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }
    public void repor(int qtd){
        qtdAtual += qtd;
    }
    public void baixa(int qtd){
        if(qtdAtual - qtd < 0) 
            System.out.println("Não é possível dar baixa em " + qtd + " produto(s), pois só existem " + qtdAtual + " no estoque");
        else
            qtdAtual -= qtd;
        verificaEstoque();
    }
    public void imprimeDados(){
        System.out.println("Nome: " + nome + "\nQunatidade mínima: " + qtdMinima + "\nQuantidade em estoque: " + qtdAtual);
    }
    
}
