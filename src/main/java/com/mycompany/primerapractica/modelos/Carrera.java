/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapractica.modelos;

import com.mycompany.primerapractica.listas.Lista;

/**
 *
 * @author manu
 */
public class Carrera {
    private static int noCarrera;
    private int[] resultados= new int[10];
    private Lista<Apuesta> apuestas = new Lista<Apuesta>(); 

    public static int getNoCarrera() {
        return noCarrera;
    }

    public static void setNoCarrera(int noCarrera) {
        Carrera.noCarrera = noCarrera;
    }

    public int[] getResultados() {
        return resultados;
    }

    public void setResultados(int[] resultados) {
        this.resultados = resultados;
    }

    public Lista<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setApuestas(Lista<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }

    
    

    


    
    
    
    
    
}
