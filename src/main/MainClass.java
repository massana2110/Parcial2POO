/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import exceptions.AtraccionLlenaException;
import exceptions.ParejaNoJuntaException;
import java.util.InputMismatchException;
import ruedas.*;
import java.util.Scanner;

/**
 * 
 * @author David Massana 00072416
 * @author Ronald Sanchez 00191018
 */

public class MainClass {
    
   
    public static void main(String[] args) {
        Gusanito g = new Gusanito("Gusanito");
        Montania_Rusa mr = new Montania_Rusa("Montania Rusa");
        Chicago cg = new Chicago("Chicago");
        
        Scanner in = new Scanner(System.in);
        int opcion;
        boolean flag = true;
        
        System.out.println("¡¡¡BIENVENIDO A NUESTRO PARQUE DE DIVERSIONES!!!");
        
        while(flag){
            try{
                mainMenu();
                opcion = in.nextInt();
                switch(opcion){
                    case 1:
                        //ESPACIO PARA CODIGO DE INGRESO PARA CADA RUEDA.
                        break;
                    case 2:
                        menuRuedas();
                        opcion = in.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("\nDISPOSICION DE ASIENTOS DE RUEDA DE GUSANITO\n");
                                g.mostrarAsientosGusanito();
                                break;
                            case 2:
                                System.out.println("\nDISPOSICION DE ASIENTOS DE RUEDA DE CHICAGO\n");
                                cg.mostrarAsientosChicago();
                                break;
                            case 3:
                                System.out.println("\nDISPOSICION DE ASIENTOS DE MONTANIA RUSA\n");
                                mr.mostrarAsientosMontaniaRusa();
                                break;
                            default:
                                System.out.println("REGRESANDO A MENU PRINCIPAL...");
                                break;
                        }
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("LO ESPERAMOS PRONTO...");
                        flag = false;
                    default:
                        System.out.println("\nINGRESE OPCION VALIDA.");
                        break;
                }
            }catch(InputMismatchException e){
                System.out.println("ERROR. ESTA INGRESANDO DATOS NO NUMERICOS.");
                in.nextLine();
            }
        }
        //TE COMENTE ESTE CODIGO POR SI LO USAS, TU LLENARAS EL CASE 1 DEL SWITCH EN EL INGRESO DE PERSONAS.
        /*
        g.llenarAsientosGusanitos();
        System.out.println("¿Cuantas personas desean subirse(1/2)");
        int opcionPersonas = in.nextInt(); in.nextLine();
        g.ingresarPersonas(opcionPersonas);
        g.mostrarAsientosGusanito();
        */
    }
    
    public static void mainMenu(){
        System.out.println("\n********* MENU PRINCIPAL **********");
        System.out.println("1. INGRESO DE PERSONAS.");
        System.out.println("2. MOSTRAR ASIENTO.");
        System.out.println("3. MOSTRAR GANANCIAS.");
        System.out.println("4. SALIR.");
        System.out.println("********* MENU PRINCIPAL **********");
        System.out.print("INGRESE OPCION: ");
    }
    
    public static void menuRuedas(){
        System.out.println("\n---------- ATRACCIONES ----------");
        System.out.println("1. RUEDA DE GUSANITO.");
        System.out.println("2. RUEDA DE CHICAGO.");
        System.out.println("3. MONTANIA RUSA.");
        System.out.println("---------- ATRACCIONES ----------");
        System.out.print("INGRESE OPCION: ");
    }
}
