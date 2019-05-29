/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import exceptions.AtraccionLlenaException;
import exceptions.ParejaNoJuntaException;
import ruedas.Gusanito;
import java.util.Scanner;

/**
 * 
 * @author David Massana 00072416
 * @author Ronald Sanchez 00191018
 */

public class MainClass {
    
    public static Scanner in;
    public static void main(String[] args) {}{
        Gusanito g = new Gusanito();
        in = new Scanner(System.in);
        System.out.println("Cuantas personas desean subirse(1/2)");
        int opcionPersonas = in.nextInt(); in.nextLine();
        g.llenarAsientosGusanito(opcionPersonas);
        g.mostrarAsientosGusanito();
    
    }
    
}
