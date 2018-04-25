/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentadores;

import Vistas.ContratoVistaMenuPrincipal;

/**
 *
 * @author utku30
 */
public class PresentadorMenuPrincipal implements ContratoPresentadorMenuPrincipal {
    private ContratoVistaMenuPrincipal vista;

    public PresentadorMenuPrincipal(ContratoVistaMenuPrincipal vista) {
        this.vista = vista;
    }
    
    @Override
    public void procesarOpcionIngresada (int opcionIngresada){
         switch (opcionIngresada){
            
            case 1: 
                System.out.println("ingreso 1");
                break;
                    
            case 2: 
                System.out.println();
                break;
                    
            case 3: 
                System.out.println();
                break;
                
            case 4: 
                System.out.println();
                break;
                
            case 5: 
                System.out.println();
                break;
            default:
                this.vista.mostrarOpcionInexistente();
                break;
        }  
        
    }
            
    @Override
    public void iniciar(){
        this.vista.mostrarMenuPrincipal();
    }
    
    
}
