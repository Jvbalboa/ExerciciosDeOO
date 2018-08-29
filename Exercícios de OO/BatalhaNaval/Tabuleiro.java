/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

/**
 *
 * @author ice
 */
public class Tabuleiro {
    int posicao[];
    int acertou;
    
    public Tabuleiro()
    {
        posicao = new int [10];
        gerarPosicao();
        acertou = 0;
    }
    private void gerarPosicao()
    {
        for(int i=0; i<10; i++)
            posicao[i] = 0;
        int esq = 0, dir = 9;
        int numero = (int)(Math.random() * 10);
        if(numero==9)
        {
            posicao[numero] = 1;
            posicao[numero-1] = 1;
            posicao[numero-2] = 1;
        }
        else if(numero==0)
        {
            posicao[numero] = 1;
            posicao[numero+1] = 1;
            posicao[numero+2] = 1;
        }
        else if(numero!=0 && numero!=9)
            posicao[numero] = 1;
            posicao[numero+1] = 1;
            posicao[numero-1] = 1;
    }
    public boolean checarTiro(int i)
    {
        if(posicao[i]==1)
        {
            System.out.println("Tiro certeiro!");
            posicao[i] = 0;
            acertou ++;
            if(acertou == 3)
                return true;
        }
        else
            System.out.println("Errou o tiro!");
        return false;
    }
}
