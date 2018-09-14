/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogobozo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ice
 */
public class Jogador {
    private Tabuleiro tabuleiro = new Tabuleiro();
    private String nome;
    private Dados dados = new Dados();

    public Jogador(String nome) {
        this.nome = nome;
    }
    
    public void lancaDados(){
        dados.rolar();
    }
    
    public void escolheDados(){
        Scanner scan = new Scanner(System.in);
        String escolha;
        escolha = JOptionPane.showInputDialog(null, "Quais dados você deseja jogar novamente? (Digite os dados separados por vírgula)");
        dados.rolar(escolha);
    }
    
    public void escolhePoscicao(){
        int escolha;
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma posição: \n1 -> Ás \n2 -> Duque \n3 -> Terno \n4 -> Quadra \n5 -> Quina \n6 -> Sena \n7 -> Fú \n8 -> Seguida \n9 -> Quadrada \n10 -> General"));
        tabuleiro.preenchePosicao(escolha-1);
    }
}
