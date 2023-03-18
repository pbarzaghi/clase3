/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoarreglos;

import javax.swing.JOptionPane;

/**
  1. Utilizando solo tipos primitivos, String (solo usar método length), vectores,
     iteraciones simples y condicionales, genere una clase por ejercicio que posea los
     siguientes métodos:
     
    
 * @author pbarzagh1
 */
public class Ejercicio1A {
    
     /* 
        a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en.
     */
    public static void main(String arg[]){
      
        String cadena = JOptionPane.showInputDialog("Ingrese la cadena");
        char letra =  JOptionPane.showInputDialog("Ingrese la letra a contar").charAt(0);
       
       ejercicioConChar(cadena,letra);
       ejercicioConString(cadena,letra);
    }
  

 private static void ejercicioConChar(String cadena,char letra){
     int cantidad=0;
     char[] cadenaChar= cadena.toCharArray();

       for(int i=0; i < cadenaChar.length;i++){
         if(cadenaChar[i]== letra  )  {
                cantidad++;
         }
        }
     System.out.println("EJERCICIO CON CHAR");  
     System.out.println("Cadena "+ cadena +" letra "+ letra + "  se repite "+ cantidad); 

     }
 
 private static void ejercicioConString(String cadena,char letra){
     int cantidad=0;
      for(int i=0; i < cadena.length();i++){  
          if(cadena.charAt(i) == letra  )  {
                cantidad++;
         }
        }
     System.out.println("EJERCICIO CON String");    
     System.out.println("Cadena "+ cadena+" letra "+ letra + "  se repite "+ cantidad); 

     }
}

