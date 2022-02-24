/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;
import controladores.OrdernarNumeros;
import controladores.LeerTxt;
import java.io.IOException;
import java.util.Arrays;
/**
 *
 * @author desar
 */
public class Main {
    public static void main(String[] args) throws IOException {
        
        int arrayData[];
        final String URL = "C:\\Users\\desar\\OneDrive\\Escritorio\\uu2022_1\\PruebasVerSoftware\\Corte1\\Numeros - copia.txt";
//        final String URL = "C:\\Users\\desar\\OneDrive\\Escritorio\\uu2022_1\\PruebasVerSoftware\\Corte1\\pruebita.txt";
        
        OrdernarNumeros on = new OrdernarNumeros();
        LeerTxt lt = new LeerTxt();
        
        arrayData = lt.extraerData(URL);
//            lt.extraerData(URL);
        on.organizarMenorMayor(arrayData);
        
    }
}
