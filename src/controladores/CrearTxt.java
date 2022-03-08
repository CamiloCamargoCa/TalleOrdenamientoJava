/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author desar
 */
public class CrearTxt {

    public void crearTxtNuevo(int[] listaNumeros, String nombreArchivo) {
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;

        try {
            String nombre = nombreArchivo;
            f = new File(nombre);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);

            for (int h = 0; h < listaNumeros.length; h++) {
                wr.append(listaNumeros[h]+"\n");
            }

            wr.close();
            bw.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "se ha producido un error : " + ex);
        }
    }

}
