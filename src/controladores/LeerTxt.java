/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
/**
 *
 * @author desar
 */
public class LeerTxt {
    
    public int[] extraerData(String url) throws FileNotFoundException, IOException{
        
        //incializa array de resultadfos en vacio
        int[] numerosExtraidos;
        
        //se crea objeto file
        File doc = new File(url);
        
        //se crea objeto buffer para el contador
        BufferedReader obj = new BufferedReader(new FileReader(doc));
        
        //se objeto buffer para leer y extraer data de txt
        BufferedReader obj1 = new BufferedReader(new FileReader(doc));
        
        //se extrae total de registro se asigna as variable cantidadDatos
        int cantidadDatos = Math.toIntExact(obj.lines().count());
        
        //se inicializa array de resultado con la cantidad de datos del archivo
        numerosExtraidos = new int[cantidadDatos];
        
        //variable que devuelve resultado en formato string
        String strng;
        int cont = 0;
        while ((strng = obj1.readLine()) != null) {
//          
            //se extraen numeros y se llena array de resultado
            numerosExtraidos[cont]=Integer.parseInt(strng);
            cont++;
        }
        
        //retorna un array con listado de numeros que trae el archivo txt
        return numerosExtraidos;
        
    }
}
