/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapractica.manejadores;

import com.mycompany.primerapractica.listas.Lista;
import com.mycompany.primerapractica.listas.Nodo;
import com.mycompany.primerapractica.modelos.Apuesta;
import javax.swing.JOptionPane;

/**
 *
 * @author manu
 */
public class ManejadorCarrera {
    
    public static int carrera = 0;
    public static Lista<Apuesta> apuestas;
    
    
    public ManejadorCarrera() {
        carrera++;
        apuestas = new Lista<Apuesta>();
    }
    
    
    public static void agregarApuesta(Apuesta apuesta){
        
        ManejadorCarrera.apuestas.add(apuesta);
        
    }
    
    
    public static void imprimirNombres(Nodo<Apuesta> apuesta){
        
        try {
            Nodo<Apuesta> evaluar;
            if(apuesta == null){
                evaluar = apuestas.getPrimerNodo();
            }else{
                evaluar = apuesta;
            }
            if(evaluar.getSiguiente() == null){
                System.out.println(evaluar.getContenido().getNombreApostador()+
                        " aposto "+evaluar.getContenido().getMonto()+evaluar.getContenido().isValidez());
            }else{
                System.out.println(evaluar.getContenido().getNombreApostador()+
                        " aposto "+evaluar.getContenido().getMonto()+evaluar.getContenido().isValidez());
                imprimirNombres(evaluar.getSiguiente());
            }           
        } catch (Exception e) {
        }
          
    }
    
}
