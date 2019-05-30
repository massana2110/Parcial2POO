/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptions;

/**
 * 
 * @author David Massana 00072416
 * @author Ronald Sanchez 00191018
 */
public class AtraccionLlenaException extends RuntimeException{

    public AtraccionLlenaException(String mensaje){
        System.out.println(mensaje);
    }
}
