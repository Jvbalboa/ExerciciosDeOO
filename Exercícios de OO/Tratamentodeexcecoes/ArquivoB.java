/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentodeexcecoes;

import java.io.FileNotFoundException;

/**
 *
 * @author ice
 */
public class ArquivoB {
    public static void m2() throws FileNotFoundException
    {
        m3();
    }
    
    public static void m3() throws FileNotFoundException
    {
        ArquivoC.m4();
    }
    
}
