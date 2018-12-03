/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonrandombattle;

/**
 *Exceção exigida na prova (lançada quando a quantidade é menor que 0)
 * @author João Victor Dutra Balboa
 */
public class ValorInvalidoException extends Exception{

    public ValorInvalidoException(String message) {
        super(message);
    }
    
}
