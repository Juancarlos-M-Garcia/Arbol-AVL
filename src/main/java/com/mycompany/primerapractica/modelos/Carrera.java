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
    private String noCarrera;
    private String[] corredores= new String[10];
    private String[] ordenFinal= new String[10];

    public Carrera(String noCarrera, String[] corredores) {
        this.noCarrera = noCarrera;
        this.corredores = corredores;
    }

    public String getNoCarrera() {
        return noCarrera;
    }

    public void setNoCarrera(String noCarrera) {
        this.noCarrera = noCarrera;
    }

    public String[] getCorredores() {
        return corredores;
    }

    public void setCorredores(String[] corredores) {
        this.corredores = corredores;
    }

    public String[] getOrdenFinal() {
        return ordenFinal;
    }

    public void setOrdenFinal(String[] ordenFinal) {
        this.ordenFinal = ordenFinal;
    }
    
    
    
    
    
    
}
