/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapractica.modelos;

/**
 *
 * @author manu
 */
public class Apuesta {
    
    private String nombreApostador; 
    private double monto;
    private int[] posiciones = new int[10];
    
    public Apuesta(String NombreApostador, Double monto, int first, int secund,
                    int third, int four, int fifth, int six, int seven,
                    int eight, int nine, int ten){
        this.nombreApostador = NombreApostador;
        this.monto = monto;
        this.posiciones[0] = first;
        this.posiciones[1] = secund;
        this.posiciones[2] = third;
        this.posiciones[3] = four;
        this.posiciones[4] = fifth;
        this.posiciones[5] = six;
        this.posiciones[6] = seven;
        this.posiciones[7] = eight;       
        this.posiciones[8] = nine;
        this.posiciones[9] = ten;
    }
    
    public Apuesta(String nombreApostador, Double monto, int[] Orden){
        this.nombreApostador = nombreApostador;
        this.monto = monto;
        this.posiciones = Orden;
    
    }

    public String getNombreApostador() {
        return nombreApostador;
    }

    public void setNombreApostador(String nombreApostador) {
        this.nombreApostador = nombreApostador;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int[] getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(int[] posiciones) {
        this.posiciones = posiciones;
    }
    
    
    
    
}
