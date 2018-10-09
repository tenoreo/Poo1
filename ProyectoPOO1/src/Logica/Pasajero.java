/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;


/**
 *
 * @author kenda
 */
public class Pasajero {
    private String nombreCompleto;
    private long cedula;
    private String lugar;
    private Direccion direccion;
    private String correo;
    private long telefono;

    public Pasajero(String nombreCompleto, long cedula, String lugar, String correo, long telefono) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    public void escribirPasajero(String pNombre,String pCorreo,String pDireccion,String pTelefono,String pCedula) throws IOException{
        SAXBuilder builder =new SAXBuilder();
        File xmlFile=new File("pasajerosDB.xml");
        try{
            Document document=(Document)builder.build(xmlFile);
            Element raiz=document.getRootElement();
            Element nuevo=new Element("Pasajero");
            nuevo.addContent(new Element("Nombre").setText(pNombre));
            nuevo.addContent(new Element("Correo").setText(pCorreo));
            nuevo.addContent(new Element("Direccion").setText(pDireccion));
            nuevo.addContent(new Element("Telefono").setText(pTelefono));
            nuevo.addContent(new Element("Cedula").setText(pCedula));
            raiz.addContent(nuevo);
            XMLOutputter escribir=new XMLOutputter();
            escribir.setFormat(Format.getPrettyFormat());
            escribir.output(raiz,new FileWriter("pasajerosDB.xml"));
            
            
        }catch(JDOMException e){
        
        }  
    }
    
    public void crearXmlPasajero(String pNombre,String pCorreo,String pDireccion,String pTelefono,String pCedula){
        try{
            Element raiz=new Element("Pasajero");// Crea un elemento Valores que sera el padre actualizado
            raiz.setName("Pasajeros");//Establece el nombre del padre nuevo
            //Crea un nuevo elemento con los nodos hijos
            Element nuevo = new Element("Pasajero");
            nuevo.addContent(new Element("Nombre").setText(pNombre));
            nuevo.addContent(new Element("Correo").setText(pCorreo));
            nuevo.addContent(new Element("Direccion").setText(pDireccion));
            nuevo.addContent(new Element("Telefono").setText(pTelefono));
            nuevo.addContent(new Element("Cedula").setText(pCedula));
            raiz.addContent(nuevo);
            //Para guardar el archivo con los nuevos datos
            XMLOutputter escribir=new XMLOutputter();
            escribir.setFormat(Format.getPrettyFormat());
            escribir.output(raiz,new FileWriter("estudiantesDB.xml"));
        }catch(IOException e){
        }
    }
    
    public List cargarEstudiantes() throws IOException{
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File("pasajerosDB.xml");//Abre el archivo xml
        List list = null;//Asigna una lista en NULL
        try {
            Document document = (Document) builder.build( xmlFile );
            Element raiz = document.getRootElement();//Obtiene el elemento Raiz
            list = raiz.getChildren();//Obtiene los hijos de ese elemento raiz
            return list;//Retorna la lista
        } catch (JDOMException e) {
            
        }return list;
    }
}
