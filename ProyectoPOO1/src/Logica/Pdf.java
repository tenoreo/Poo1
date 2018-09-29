/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author Kendall Tenorio Chévez
 */
public class Pdf {
    private String nombreChofer;
    private String telefonoChofer;
    private String iViaje;
    private String fecha;
    private String hora;
    private ArrayList Lviajeros;
    private ArrayList NViajeros;
    
    public void CrearPdf() throws FileNotFoundException{
        FileOutputStream archivo=new FileOutputStream("Hola");
        Document documento=new Document();
        PdfWriter.getInstance(documento,archivo);
        documento.open();
        
        Paragraph parrafo= new Paragraph("Viaje");
        parrafo.setAligment(1);
        documento.add(parrafo);
        //aqui se debe poner todos los datos
        documento.add(new Paragraph("nombre"));
        documento.close();
        JOptionPane.showMessageDialog(null,"Archivo Pdf creado correctamente");
        
    }
    
    public void abrir(String nombre){
        try { 
            File path = new File(nombre + ".pdf"); 
            Desktop.getDesktop().open(path); 
        } catch (Exception ex) { 
        JOptionPane.showMessageDialog(null, ex,"Atención",2); 
        } 
    }
}
