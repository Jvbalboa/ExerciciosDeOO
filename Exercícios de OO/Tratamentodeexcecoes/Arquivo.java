/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentodeexcecoes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;


/**
 *
 * @author ice
 */
public class Arquivo {
    public static void abrirArquivoComTry(){
        File arq = new File("/ice/Downloads/teste.txt");
        try {
            FileInputStream f = new FileInputStream(arq);
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: " + ex);
        }           
    }
    public static void abrirArquivoComThrow(){
        try {
            ArquivoB.m2();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
