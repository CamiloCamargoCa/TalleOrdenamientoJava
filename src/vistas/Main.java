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
        
        //array inicializado null, el que toma arraglos de la lectura txt y pasa la data a la clase de ordenamiento de numero
        int arrayData[];
        
        //url de documento txt
        final String URL = "C:\\Users\\desar\\OneDrive\\Documentos\\NetBeansProjects\\PracticaProgramacion\\src\\vistas\\pruebita.txt";
        
        //objeto clase ordenar numro
        OrdernarNumeros on = new OrdernarNumeros();
        
        //objeto clase leer txt
        LeerTxt lt = new LeerTxt();
        
        //datos en array extraidos del txt se asigna a variable arrayData
        arrayData = lt.extraerData(URL);
        
        //función que ordena array de numeros
        on.organizarMenorMayor(arrayData);
        
    }
}