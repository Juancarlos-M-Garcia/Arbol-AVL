/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapractica.manejadores;

import com.mycompany.primerapractica.modelos.Apuesta;
import javax.swing.JOptionPane;

/**
 *
 * @author manu
 */
public class ManejadorCarrera {
    
    public static int carrera = 0;
    public Apuesta[] apuestas;
    
    
    public ManejadorCarrera() {
        carrera++;
        
    }
    
    
    public void agregarApuesta(Apuesta apuesta){
        Apuesta temp[];
        try{
            if(apuestas == null){
                apuestas = new Apuesta[1];
                apuestas[0]= apuesta;
            }else{
                temp = new Apuesta[apuestas.length+1];
                for(int i = 0 ; i<temp.length; i++){
                    if(i<apuestas.length){
                        temp[i]= apuestas[i];
                    }else if(i>apuestas.length){
                        JOptionPane.showMessageDialog(null,"Error en la matrix xd");
                    }else{
                        temp[i]= apuesta;
                    }
                }
                this.apuestas = temp;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public void imprimirNombres(){
        
        try {
            for(int i = 0; i<apuestas.length; i++ ){
                System.out.println(apuestas[i].getNombreApostador()+" apostó $"+apuestas[i].getMonto());
            } 
            
        } catch (Exception e) {
        }
          
    }
    
}
