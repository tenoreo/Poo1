/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
    private static int pdfN=1; 
    
    /**
     *
     * @throws FileNotFoundException
     * @throws com.itextpdf.text.DocumentException
     */
    public void CrearPdf(String chofer,String telefono,String puntoInicio,String fecha,String hora,String[][] Lviajeros) throws FileNotFoundException, DocumentException, IOException{
        Document documento=new Document();
        String path=new File(".").getCanonicalPath();
        String FName=path+"\\Poo1\\ProyectoPOO1\\Pdf\\Viaje"+pdfN+".pdf";
        PdfWriter.getInstance(documento,new FileOutputStream(new File(FName)));
        documento.open();
        
        Paragraph parrafo= new Paragraph("Viaje");
        //parrafo.setAligment(1);
        documento.add(parrafo);
        Paragraph parrafo1=new Paragraph("El viaje del dia "+fecha+ " a la hora "+hora+"."+
                "Esta asignado al chofer "+chofer+" el cual su numero de telefonico "+telefono +" donde el punto de salida es en " +
                puntoInicio+".");
        documento.add(parrafo1);
        Paragraph parrafo2=new Paragraph("Miembros                                                  Telefonos");
        documento.add(parrafo2);
        for(int i=0;i<Lviajeros.length;i++){
            Paragraph parrafo3=new Paragraph(Lviajeros[i][0]+"                                                  "+Lviajeros[i][1]);
            documento.add(parrafo3);
        }
        documento.close();
        JOptionPane.showMessageDialog(null,"Archivo Pdf creado correctamente");
        pdfN++;
    }
    
    public void abrir(String nombre){
        try { 
            File path = new File(nombre + ".pdf"); 
            Desktop.getDesktop().open(path); 
        } catch (IOException ex) { 
        JOptionPane.showMessageDialog(null, ex,"Atención",2); 
        } 
    }
}
