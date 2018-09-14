/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogobozo;

import javax.swing.JOptionPane;

/**
 *
 * @author ice
 */
class Tabuleiro {
    private int[] pontPosicao = new int[10];
    private int pontuacao;

    public int getPontuacao() {
        return pontuacao;
    }
    
    public void exibeTabuleiro(){
        int i = 0;
        while(i < 9){
            switch(i){
                case 0:
                    JOptionPane.showMessageDialog(null, "Ás: " + pontPosicao[i]);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Duque: " + pontPosicao[i]);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Terno: " + pontPosicao[i]);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Quadra: " + pontPosicao[i]);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Quina: " + pontPosicao[i]);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Sena: " + pontPosicao[i]);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Fú: " + pontPosicao[i]);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Seguida: " + pontPosicao[i]);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Quadrada: " + pontPosicao[i]);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "General: " + pontPosicao[i]);
                    break;
            }
        }
    }
    
    public void calculaPontuacao(){
        pontuacao = 0;
        for(int i : pontPosicao)
            pontuacao += i;
        JOptionPane.showMessageDialog(null, "Pontuação: " + pontuacao);
    }
    
    public void calculaPontuacao(int posicao){
        pontuacao += pontPosicao[posicao];
        JOptionPane.showMessageDialog(null, "Pontuação: " + pontuacao);
    }
    
    public void preenchePosicao(int posicao){
        if(pontPosicao[posicao] != 0)
            
    }
}
