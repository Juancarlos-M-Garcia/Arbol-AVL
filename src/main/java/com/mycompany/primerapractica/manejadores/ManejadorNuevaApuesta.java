/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapractica.manejadores;

import com.mycompany.primerapractica.frames.NuevaApuesta;
import com.mycompany.primerapractica.modelos.Apuesta;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author manu
 */
public class ManejadorNuevaApuesta {

   
    private int numerosDisponibles[] = {1,2,3,4,5,6,7,8,9,10};
    private int ordenNumeros[] = new int[10];
    private int resultados[] = new int[10];

    public ManejadorNuevaApuesta() {
    }
    
    
    
    public boolean evaluarNumerosIngresados(JTextField texto, int lugar){
        boolean exito = false; 
        try {
            int num = Integer.parseInt(texto.getText());
            if(num<11 && num>0){    
                    if(numerosDisponibles[num-1] == num ){
                        this.numerosDisponibles[num-1]=-1;
                        ordenNumeros[lugar] = num;
                        this.borrarNumero(num);
                        exito = true;
                        
                    }else if(numerosDisponibles[num-1] == -1){
                       
                texto.setText("");
                    }
            }else{
                
                texto.setText("");
            }    
        } catch (Exception e) {
            
            texto.setText("");
        }        
        return exito;
    }

    
    private void borrarNumero(int num){
        //int numero = Integer.parseInt(num);
        if(num>0){
            numerosDisponibles[num-1]=-1;
        }
    }
    
    
    public void crearApuesta(JTextField nombre ,JTextField monto  ){
        try {
            String nom = (String) nombre.getText();
            double mon = Double.parseDouble(monto.getText());
            try {
                if(nom != null && mon > 0){
                Apuesta apuesta  = new Apuesta(nom, mon, this.ordenNumeros );
                apuesta.isNumerosRepetidos(apuesta.getPosiciones());
                ManejadorCarrera.agregarApuesta(apuesta, apuesta.isValidez());
                }else{
                    System.out.println("Por favor llenar los espacion de nombre y monto correctamente.\n Casiilas Nombre con su nombre y monto con la cantidad de dinero que desea apostar");
                }
                
            } catch (Exception e) {
                System.out.println("Ocurrio un error al crear su apuesta... \nPor favor intentelo de nuevo, llenando cada casilla de forma correcta");
            }
            
            
        } catch (Exception e) {
            System.out.println("Por favor llenar los espacion de nombre y monto correctamente.\n Casiilas Nombre con su nombre y monto con la cantidad de dinero que desea apostar");
        }
    }
    
    
    public void llenarNumerosDisponibles(){
        for(int i = 0; i<10; i++){
            numerosDisponibles[i]= i+1;
        }
    }

    public int[] getResultados() {
        return resultados;
    }

    public void setResultados(int[] resultados) {
        this.resultados = resultados;
    }

    public int[] getOrdenNumeros() {
        return ordenNumeros;
    }

    
    
    
    
    
    
    
}
