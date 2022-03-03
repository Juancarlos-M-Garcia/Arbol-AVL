/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapractica.modelos;

/**
 *
 * @author manu
 */
public class Carrera {
    private static int noCarrera;
    private String[] ordenFinal= new String[10];

    
    public Carrera(){
        noCarrera++;
    }

    

    public String[] getOrdenFinal() {
        return ordenFinal;
    }

    public void setOrdenFinal(String[] ordenFinal) {
        this.ordenFinal = ordenFinal;
    }
    
    
    
    
    
    
}
