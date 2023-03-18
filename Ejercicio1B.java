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
public class Ejercicio1B {
    
  //   b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
  //      mismos y los retorne en un vector de 3
   public static void main(String arg[]){ 
    int[] numeros= new int[3];
   
    String nro1=JOptionPane.showInputDialog("Ingrese un munero 1 ");
    String nro2=JOptionPane.showInputDialog("Ingrese un munero 2 ");
    String nro3=JOptionPane.showInputDialog("Ingrese un munero 3 ");
    
    
    numeros[0]= Integer.parseInt(nro1);
    numeros[1]= Integer.parseInt(nro2);
    numeros[2]= Integer.parseInt(nro3);
    
 
    
     char orden =  JOptionPane.showInputDialog("Order Desendiente (D)- Ascendiente (A)").toLowerCase().charAt(0);
   
     System.out.println("INGRESO Nros Originales " +nro1+" "+ nro2+" "+nro3);
     numeros=imprimirOrdenArreglo(numeros, orden);
     System.out.println("Orden "+orden + " Vector "+numeros[0]+" "+numeros[1]+" "+numeros[2]);
    
   }
  
   
   /*
     Funcion que retorna un vertor ordenado de forma desendiente o ascendiente segun el orden
     Se va realizar tanta veces como la longitud del vector, hasta que cumpla con la condicion
     de ordenacion.
      
   */
   
   private static int[] imprimirOrdenArreglo(int[] numeros, char orden){
   
       int auxiliar;
       boolean desendiente =(orden =='d');
       for(int i=1; i< numeros.length;){
       
           if(desendiente){
             if(numeros[i-1]> numeros[i]){
              auxiliar=numeros[i-1];
              numeros[i-1]=numeros[i];
              numeros[i]=auxiliar;
              i=1;
             }else {
              i++;
             }
           }else {
                 if(numeros[i-1]  < numeros[i]){
                    auxiliar=numeros[i];
                    numeros[i]=numeros[i-1];
                    numeros[i-1]=auxiliar;
                      i=1;
                  }else {
                      i++;
                  }//Fin If
           
           }// fin else
       
       }// fin del for
       return numeros;
   }
}
