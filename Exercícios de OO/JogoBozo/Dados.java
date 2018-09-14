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
public class Dados {
    private int[] faces = new int[5];
    private int numFaces;
    
    public void imprimeFaces(){
        for(int i:faces)
        JOptionPane.showMessageDialog(null, "Dado " + i + ": " + faces[i]);
    }
    
    public int [] getFaces(){
        return faces;
    }
    
    public void rolar(){
        for(int i:faces)
            faces[i] = (int)((Math.random()*6) + 1);
        imprimeFaces();
    }
    
    public void rolar(String dados){
        String escolha[] = dados.split(",");
        int aux;
        for(int i = 0; i < escolha.length; i++ )
        {
            aux = Integer.parseInt(escolha[i]);
            if(aux > 0 && aux < 6)
                faces[i] = (int)((Math.random()*6) + 1);
        }
        imprimeFaces();
    }
}
