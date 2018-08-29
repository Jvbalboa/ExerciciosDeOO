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
public class Jogador {
    Tabuleiro tabuleiro;
    private String nome;
    private int palpite, numPalpite;
    
    public Jogador()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = (scan.nextLine());
        tabuleiro = new Tabuleiro();
        numPalpite = 0;
    }
    public String getNome()
    {
        return nome;
    }
    public void setPalpite(int p)
    {
        palpite = p;
        numPalpite ++;
    }
    public int getPalpite()
    {
        return palpite;
    }
}
