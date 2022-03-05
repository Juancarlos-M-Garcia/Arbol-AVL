/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapractica.manejadores;

import com.mycompany.primerapractica.listas.Lista;
import com.mycompany.primerapractica.listas.Nodo;
import com.mycompany.primerapractica.modelos.Apuesta;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author manu
 */
public class ManejadorCarrera {
    
    private boolean iniciada = false;
    public static int carrera = 0;
    public static Lista<Apuesta> apuestasValidas =new Lista<Apuesta>();
    public static Lista<Apuesta> apuestasNoValidas = new Lista<Apuesta>();
    public static Lista<Apuesta> apuestas = new Lista<Apuesta>();
    public static int[] resultados;
    
    
    public ManejadorCarrera() {
        carrera++;
        apuestasValidas =new Lista<Apuesta>();
        apuestasNoValidas =new Lista<Apuesta>();
        apuestas =new Lista<Apuesta>();
        this.iniciada=true;
        resultados = null;
    }
    
    
    public static void agregarApuesta(Apuesta apuesta, boolean validez){
        if(validez){
            ManejadorCarrera.apuestasValidas.add(apuesta);
        }else{
            ManejadorCarrera.apuestasNoValidas.add(apuesta);
        }
        
        ManejadorCarrera.apuestas.add(apuesta);
    }
    
    
    public static void imprimirApuestas(Nodo<Apuesta> apuesta, boolean x, JTextArea area){
        
        try {
            
            Nodo<Apuesta> evaluar;
            if(apuesta == null){
                if(x){
                    evaluar = apuestasValidas.getPrimerNodo();
                }else {
                    evaluar = apuestasNoValidas.getPrimerNodo();
                }
            }else{
                evaluar = apuesta;
            }
            if(evaluar.getSiguiente() == null){
                Apuesta ap = evaluar.getContenido();
                area.append(ap.getNombreApostador()+" apostó "+ ap.getMonto()+" y obtuvo "+ap.getPuntos()+" puntos" );
            }else{
               Apuesta ap = evaluar.getContenido();
                area.append(ap.getNombreApostador()+" apostó "+ ap.getMonto()+" y obtuvo "+ap.getPuntos()+" puntos \n");
                imprimirApuestas(evaluar.getSiguiente(), x, area);
            }    
            
                   
        } catch (NullPointerException e) {
             area.setText("No hubieron apuestas durante esta carrera");
        }catch (Exception e) {
             area.setText("Error");
        }
        
          
    }
    
    public void evaluarApuestas(Nodo<Apuesta> apuesta){
         try {
            Nodo<Apuesta> evaluar;
            if(apuesta == null){
                evaluar = apuestasValidas.getPrimerNodo();
            }else{
                evaluar = apuesta;
            }
            if(evaluar.getSiguiente() == null){
                evaluarResultadosApuesta(evaluar);
            }else{
                evaluarResultadosApuesta(evaluar);
                evaluarApuestas(evaluar.getSiguiente());
            }           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "hubo un problema al evaluar los resultados de las apuestas");
        }               
        
    }
    
    public void evaluarResultadosApuesta(Nodo<Apuesta> evaluar){
        for(int j = 0; j<10; j++){    
            if(evaluar.getContenido().getPosiciones()[j] == this.getResultados()[j]){
                    int suma = evaluar.getContenido().getPuntos()+(10-j);
                    evaluar.getContenido().setPuntos(suma);
                }
        }
    }
    
    

    public boolean isIniciada() {
        return iniciada;
    }

    public void setIniciada(boolean iniciada) {
        this.iniciada = iniciada;
    }

    
    
    public int[] getResultados() {
        return resultados;
    }

    public void setResultados(int[] resultados) {
        this.resultados = resultados;
    }

    public static Lista<Apuesta> getApuestasValidas() {
        return apuestasValidas;
    }
    
    
    
    
    
    
}
