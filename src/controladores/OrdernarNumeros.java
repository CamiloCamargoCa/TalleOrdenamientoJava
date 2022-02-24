/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

/**
 *
 * @author desar
 */
public class OrdernarNumeros {
    
    public void organizarMenorMayor(int[] listaNumeros){
         int temporal = 0;

        for (int i = 0; i < listaNumeros.length; i++) {
            for (int j = 1; j < (listaNumeros.length - i); j++) {
                if (listaNumeros[j - 1] > listaNumeros[j]) {
                    temporal = listaNumeros[j - 1];
                    listaNumeros[j - 1] = listaNumeros[j];
                    listaNumeros[j] = temporal;
                }
            }
        }
//        System.out.printf(Arrays.toString(a));

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("posición: "+i+" == "+listaNumeros[i]);
        }
    }
    
}
