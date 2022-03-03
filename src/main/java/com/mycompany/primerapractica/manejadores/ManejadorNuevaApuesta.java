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

    private NuevaApuesta ventana;
    private int numerosDisponibles[] = {1,2,3,4,5,6,7,8,9,10};
    private int ordenApuesta[] = new int[10];
    private boolean apuestaDisponible = false;
    private ManejadorCarrera carrera;
    
    public ManejadorNuevaApuesta(NuevaApuesta ventana, ManejadorCarrera carrera) {
        this.ventana = ventana;
        this.carrera = carrera;  
        
    }
    
    @SuppressWarnings("empty-statement")
    public boolean evaluarNumerosIngresados(JTextField texto, int lugar){
        boolean exito = false; 
        try {
            int num = Integer.parseInt(texto.getText());
            if(num<11 && num>0){    
                    if(numerosDisponibles[num-1] == num ){
                        this.numerosDisponibles[num-1]=-1;
                        ordenApuesta[lugar] = num;
                        this.borrarNumero(num);
                        exito = true;
                        
                    }else if(numerosDisponibles[num-1] == -1){
                        JOptionPane.showMessageDialog(null, "Los numeros detro de las casillas no deben estar repetidos.\nPor favor intentelo de nuevo");
                texto.setText("");
                    }
                    
                
            }else{
                JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros enteros de 1 a 10 dentro de las casillas");
                texto.setText("");
            }    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hay un error en uno de los datos que ingreso. \nPor favor solo ingrese numeros enteros de 1 a 10 dentro de las casillas");
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
    
    
    public void crearObjeto(JTextField nombre ,JTextField monto  ){
        try {
            String nom = (String) nombre.getText();
            double mon = Double.parseDouble(monto.getText());
            try {
                if(nom != null && mon > 0){
                Apuesta apuesta  = new Apuesta(nom, mon, this.ordenApuesta );
                carrera.agregarApuesta(apuesta);
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
    
    
    
    
    
}
