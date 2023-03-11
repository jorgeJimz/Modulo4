/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modulo4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Modulo4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int num = 1;
        
         Scanner constructor=new Scanner(System.in);
         
         System.out.println("Ingrese catidad de numeros a imprimir ");
        num=constructor.nextInt();
        
        for(int x = 1; x <= num; x++)
        System.out.println(x + "\t");
        
       
      }
            
    }
    

