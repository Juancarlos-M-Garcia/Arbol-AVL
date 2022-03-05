/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapractica.archivos;

import com.mycompany.primerapractica.manejadores.ManejadorCarrera;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.mycompany.primerapractica.modelos.Apuesta;

/**
 *
 * @author manu
 */
public class LecturaArchivo {
    
    
        public void leerFichero(File archivo) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            //con la linea leida, separamos los campos
            String[] campos = separarCampos(linea);
            Apuesta nueva = new Apuesta(campos);
            nueva.verificarDatos(nueva.getDatos(), nueva.isValidez());
            ManejadorCarrera.agregarApuesta(nueva, nueva.isValidez());
            //pasamos el texto a objeto
           
        }
        fr.close(); 
        
    }
    
       public String[] separarCampos( String linea){
        String lineaDeCampos = linea;
        //System.out.println(lineaDeCampos);
        String[] campos = lineaDeCampos.split(",");
        return campos;
    }
    
       
       
}
