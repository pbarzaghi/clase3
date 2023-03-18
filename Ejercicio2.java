package com.mycompany.proyectoarreglos;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * 2. Genere una clase que tenga los métodos para realizar la codificación y decodificación
 *    de un string, dado un número de desplazamiento
 *
 * @author pBarzaghi
 */
public class Ejercicio2 {
    
    
    public static void main(String arg[]){
    
     String cadena = JOptionPane.showInputDialog("Ingrese la cadena");
     int desplazamiento= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un munero Desplazamiento "));
     String StrCode="abcdefghijklmnñopqrstuvwxyz";
     
     String resultadoCode=codificarStr(cadena.strip(), StrCode, desplazamiento);
    
     System.out.println(" Cadena: "+ cadena + " - Codificacion: "+  resultadoCode);     
   
     String resultadoDeCode= decoStr(resultadoCode, StrCode, desplazamiento);
     
     System.out.println(" Cadena Codificada: "+ resultadoCode + " - Codificacion: "+  resultadoDeCode);     
     
     
    }
    private static String codificarStr(String cadena,String strCode,int desplazamiento){
            
         char[] cadenaChar= cadena.toCharArray();
         String resultado="";
         int posicion=0;
       for(int i=0; i < cadenaChar.length;i++){
                   
            posicion = strCode.indexOf(cadenaChar[i]);
            if(posicion != -1 ){
            resultado+=strCode.charAt(posicion+desplazamiento);
           }else{
              resultado+=strCode.charAt(0);
         }
       
       }
    return resultado;
    }
    
    
   private static String decoStr(String cadena,String strCode,int desplazamiento){
    char[] cadenaChar= cadena.toCharArray();
         String resultado="";
         int posicion=0;
       for(int i=0; i < cadenaChar.length;i++){
                   
            posicion = strCode.indexOf(cadenaChar[i]);
             if(posicion == 0 )
                   resultado+=" ";
             else 
                 resultado+=strCode.charAt(posicion-desplazamiento);
        
       
       }
    return resultado;
    }
}
