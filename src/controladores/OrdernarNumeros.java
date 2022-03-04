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

    public void organizarMenorMayor(int[] listaNumeros) {

        //shell
        int salto,i,j,k,auxiliar;
        salto=listaNumeros.length/2;
        while(salto>0){
            for (i = salto;  i<listaNumeros.length; i++) {
                j=i-salto;
                while(j>=0){
                    k=j+salto;
                    if(listaNumeros[j]<=listaNumeros[k]){
                        j=-1;
                    }else{
                        auxiliar = listaNumeros[j];
                        listaNumeros[j] = listaNumeros[k];
                        listaNumeros[k] = auxiliar;
                        j -= salto;
                    }
                }
            }
            salto=salto/2;
        }


        for (int h = 0; h < listaNumeros.length; h++) {
            System.out.println("posición: " + h + " == " + listaNumeros[h]);
        }

    }
    
    
}
