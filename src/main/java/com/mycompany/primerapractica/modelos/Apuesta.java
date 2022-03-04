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
    private String[] datos ;
    private boolean validez = false;
    private int puntos =0;
    
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
    
    
    public void verificarDatos(String[]datos, boolean validez){
        try {
            for(int i= 0; i<datos.length; i++ ){	
                switch(i){
			case 0:				
				this.nombreApostador = (String)datos[i];
                                break;
                        case 1:					
				this.monto= Double.parseDouble(datos[i]);
                                break;
                        default:					
				this.posiciones[i-2] = Integer.parseInt(datos[i]); 
		}
            }
		if(this.posiciones.length==10){			
                    for(int i= 0; i<10; i++ ){
                        if(posiciones[i]>0 && posiciones[i]<11){
                            validez = isNumerosRepetidos(posiciones);
                        }else{
                            validez= false;
                            break;
                        }
                    
                    }
                    			
		}else{						
			validez = false;
                }
        } catch (Exception e) {
            validez = false;
        }
    }
       
    
    public boolean isNumerosRepetidos(int[]datos){
        boolean x = false;
        int[] num = new int[]{1,2,3,4,5,6,7,8,9,10};          
             
            for(int i =0; i<datos.length;i++){
               if(num[datos[i]-1] == -1){
                   validez = false;
                   break;
               }else{
                   num[datos[i]-1] = -1;
                   validez = true;
               }
            }
        return x;
    }
    //  num[dato[i]-1]=1      dato[0]=1
    //  num[dato[i]-1]=-1      dato[1]=2
    
    
    
    
    public Apuesta(String[]datos){
        this.datos = datos;
        this.verificarDatos(datos, this.validez);
        
    }

    public String[] getDatos() {
        return datos;
    }

    public void setDatos(String[] datos) {
        this.datos = datos;
    }

    public boolean isValidez() {
        return validez;
    }

    public void setValidez(boolean validez) {
        this.validez = validez;
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
