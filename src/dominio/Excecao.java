/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author darlan
 */
public class Excecao extends Exception{
    
    public Excecao(String msg){
        super("ERRO! "+msg); 
    }
}
