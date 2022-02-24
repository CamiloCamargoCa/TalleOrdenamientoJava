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
        
        int[] numerosExtraidos;
        File doc = new File(url);
        BufferedReader obj = new BufferedReader(new FileReader(doc));
        BufferedReader obj1 = new BufferedReader(new FileReader(doc));
        int cantidadDatos = Math.toIntExact(obj.lines().count());
        
        numerosExtraidos = new int[cantidadDatos];
        String strng;
        int cont = 0;
        while ((strng = obj1.readLine()) != null) {
//            System.out.println(strng);
            numerosExtraidos[cont]=Integer.parseInt(strng);
            cont++;
        }
        
        return numerosExtraidos;
        
    }
}
