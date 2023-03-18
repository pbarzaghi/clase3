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
public class Ejercicio1C {
    
    public static void main(String arg[]){
    
    //  C. Dado un vector de numeros y un mumero X, que sume todoslosmumeros > X y 
    //     retorne el resultado
     int tamanio= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector "));
    
     int[] vector=new int[tamanio];
     String cadena="";
     int nroX= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero X "));
     for(int i=0; i < tamanio; i++){
          vector[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero "+i));
          cadena+=" "+vector[i];
     }
     
     int resultado= sumaVectorMayoresX(vector, nroX);
     System.out.print("El resultado de" + cadena +" la suma es "+ resultado);
    }
    
    /*
     Funcion que dado el vector de mumeros los va sumar todos los mayores a X
      */
     private static int sumaVectorMayoresX(int[] vector,int X){
     
         int suma=0;
         for(int i=0; i < vector.length;i++){
            if(vector[i] > X){
              suma+=vector[i];
            }
         }
     return suma;
     }
}
