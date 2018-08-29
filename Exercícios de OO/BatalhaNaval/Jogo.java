/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Jogo {
    Jogador j1, j2;
    int jogadas ;
    
    public Jogo()
    {
        j1 = new Jogador();
        j2 = new Jogador();
        jogadas = 0;
    }
    public void jogar()
    {
        Scanner scan = new Scanner(System.in);
        while(jogadas < 51)
        {
            jogadas ++;
            System.out.println(j1.getNome() + ", digite a posição: ");
            j1.setPalpite(scan.nextInt());
            if(j1.tabuleiro.checarTiro(j1.getPalpite()))
            {
                System.out.println("Parabéns " + j1.getNome() + "! Você venceu.");
                System.exit(1);
            }
            System.out.println(j2.getNome() + ", digite a posição: ");
            j2.setPalpite(scan.nextInt());
            if(j2.tabuleiro.checarTiro(j2.getPalpite()))
            {
                System.out.println("Parabéns " + j2.getNome() + "! Você venceu.");
                System.exit(1);
            }
        }
    }
}
