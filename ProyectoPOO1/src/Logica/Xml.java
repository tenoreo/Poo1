/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.Cifrado;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.mail.MessagingException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author kenda
 */
public class Xml {
    public void escribirChofer(String pNombre,String pCorreo,String pTelefono,
            String pCedula,ArrayList<Licencia> pLicencias) throws IOException{
        SAXBuilder builder =new SAXBuilder();
        File xmlFile=new File("choferDB.xml");
        try{
            Document document=(Document)builder.build(xmlFile);
            Element raiz=document.getRootElement();
            Element nuevo=new Element("Chofer");
            nuevo.addContent(new Element("Nombre").setText(pNombre));
            nuevo.addContent(new Element("Correo").setText(pCorreo));
            nuevo.addContent(new Element("Telefono").setText(pTelefono));
            nuevo.addContent(new Element("Cedula").setText(pCedula));
            Element tLicencias=nuevo.getChild("Licencias");
            for(int i=0;i<pLicencias.size();i++){
                tLicencias.addContent(new Element("Tipo").setText(pLicencias.get(i).getTipo()));
                tLicencias.addContent(new Element("Fecha de Emision").setText(pLicencias.get(i).getFechaEmision()));
                tLicencias.addContent(new Element("Numero").setText(pLicencias.get(i).getNumero()));
                tLicencias.addContent(new Element("Fecha de expiracion").setText(pLicencias.get(i).getFechaExpiracion()));
            }raiz.addContent(nuevo);
            XMLOutputter escribir=new XMLOutputter();
            escribir.setFormat(Format.getPrettyFormat());
            escribir.output(raiz,new FileWriter("pasajerosDB.xml"));
            
            
        }catch(JDOMException e){
        
        }  
    }
    
    public void crearXmlChofer(String pNombre,String pCorreo,String pTelefono,
            String pCedula,ArrayList<Licencia> pLicencias){
        try{
            Element raiz=new Element("Pasajero");// Crea un elemento Valores que sera el padre actualizado
            raiz.setName("Pasajeros");//Establece el nombre del padre nuevo
            //Crea un nuevo elemento con los nodos hijos
            Element nuevo = new Element("Chofer");
            nuevo.addContent(new Element("Nombre").setText(pNombre));
            nuevo.addContent(new Element("Correo").setText(pCorreo));
            nuevo.addContent(new Element("Telefono").setText(pTelefono));
            nuevo.addContent(new Element("Cedula").setText(pCedula));
            Element tLicencias=nuevo.getChild("Licencias");
            for(int i=0;i<pLicencias.size();i++){
                tLicencias.addContent(new Element("Tipo").setText(pLicencias.get(i).getTipo()));
                tLicencias.addContent(new Element("Fecha de Emision").setText(pLicencias.get(i).getFechaEmision()));
                tLicencias.addContent(new Element("Numero").setText(pLicencias.get(i).getNumero()));
                tLicencias.addContent(new Element("Fecha de expiracion").setText(pLicencias.get(i).getFechaExpiracion()));
            }raiz.addContent(nuevo);
            //Para guardar el archivo con los nuevos datos
            XMLOutputter escribir=new XMLOutputter();
            escribir.setFormat(Format.getPrettyFormat());
            escribir.output(raiz,new FileWriter("choferDB.xml"));
        }catch(IOException e){
        }
    }
    
    public List cargarChoferes(){
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File("choferDB.xml");//Abre el archivo xml
        List list = null;//Asigna una lista en NULL
        try {
            Document document = (Document) builder.build( xmlFile );
            Element raiz = document.getRootElement();//Obtiene el elemento Raiz
            list = raiz.getChildren();//Obtiene los hijos de ese elemento raiz
            return list;//Retorna la lista
        } catch (JDOMException | IOException e) {
            
        }return list;
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
    
    public List cargarPasajero() throws IOException{
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
    
    public void escribirUsuario(String pNombre,String pNombreUsuario,String pTelefono,String pContrasenia,String pDepartamento) throws IOException{
        SAXBuilder builder =new SAXBuilder();
        File xmlFile=new File("usuariosDB.xml");
        try{
            Document document=(Document)builder.build(xmlFile);
            Element raiz=document.getRootElement();
            Element nuevo=new Element("Usuario");
            nuevo.addContent(new Element("Nombre").setText(pNombre));
            nuevo.addContent(new Element("Nombre Usuario").setText(pNombreUsuario));
            nuevo.addContent(new Element("Telefono").setText(pTelefono));
            nuevo.addContent(new Element("Cedula").setText(pContrasenia));
            nuevo.addContent(new Element("Contraseña").setText(pDepartamento));
            raiz.addContent(nuevo);
            XMLOutputter escribir=new XMLOutputter();
            escribir.setFormat(Format.getPrettyFormat());
            escribir.output(raiz,new FileWriter("usuariosDB.xml"));
            
            
        }catch(JDOMException e){
        
        }  
    }
    
    public void crearXmlUsuario(String pNombre,String pNombreUsuario,String pTelefono,String pDepartamento) throws MessagingException{
        try{
            Element raiz=new Element("Usuario");// Crea un elemento Valores que sera el padre actualizado
            raiz.setName("Usuarios");//Establece el nombre del padre nuevo
            //Crea un nuevo elemento con los nodos hijos
            Element nuevo = new Element("Usuario");
            nuevo.addContent(new Element("Nombre").setText(pNombre));
            nuevo.addContent(new Element("Nombre Usuario").setText(pNombreUsuario));
            nuevo.addContent(new Element("Telefono").setText(pTelefono));
            nuevo.addContent(new Element("Contraseña").setText(pContrasenia));
            nuevo.addContent(new Element("Departamento").setText(pDepartamento));
            raiz.addContent(nuevo);
            //Para guardar el archivo con los nuevos datos
            XMLOutputter escribir=new XMLOutputter();
            escribir.setFormat(Format.getPrettyFormat());
            escribir.output(raiz,new FileWriter("usuariosDB.xml"));
            Correo correo=new Correo();
            correo.enviarCorreo(pNombreUsuario);
        }catch(IOException e){
        }
    }
    
    public List cargarUsuarios() throws IOException{
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File("usuariosDB.xml");//Abre el archivo xml
        List list = null;//Asigna una lista en NULL
        try {
            Document document = (Document) builder.build( xmlFile );
            Element raiz = document.getRootElement();//Obtiene el elemento Raiz
            list = raiz.getChildren();//Obtiene los hijos de ese elemento raiz
            return list;//Retorna la lista
        } catch (JDOMException e) {
            
        }return list;
    }
    
    public void escribirVehiculo(String placa, String anioFabricacion, String color, String capacidad, String kilometraje, 
            String numVin, String sede, String estado) throws IOException{
        SAXBuilder builder =new SAXBuilder();
        File xmlFile=new File("usuariosDB.xml");
        try{
            Document document=(Document)builder.build(xmlFile);
            Element raiz=document.getRootElement();
            Element nuevo=new Element("Usuario");
            nuevo.addContent(new Element("Placa").setText(placa));
            nuevo.addContent(new Element("Año de fabricacion").setText(anioFabricacion));
            nuevo.addContent(new Element("color").setText(color));
            nuevo.addContent(new Element("Capacidad").setText(capacidad));
            nuevo.addContent(new Element("Kilometraje").setText(kilometraje));
            
            nuevo.addContent(new Element("Numero Vin").setText(numVin));
            nuevo.addContent(new Element("Sede").setText(sede));
            nuevo.addContent(new Element("Estado").setText(estado));
            raiz.addContent(nuevo);
            XMLOutputter escribir=new XMLOutputter();
            escribir.setFormat(Format.getPrettyFormat());
            escribir.output(raiz,new FileWriter("usuariosDB.xml"));
            
            
        }catch(JDOMException e){
        
        }  
    }
    
    public void crearXmlVehiculo(String placa, String anioFabricacion, String color, String capacidad, String kilometraje, 
            String numVin, String sede, String estado){
        try{
            Element raiz=new Element("Usuario");// Crea un elemento Valores que sera el padre actualizado
            raiz.setName("Usuarios");//Establece el nombre del padre nuevo
            //Crea un nuevo elemento con los nodos hijos
            Element nuevo=new Element("Usuario");
            nuevo.addContent(new Element("Placa").setText(placa));
            nuevo.addContent(new Element("Año de fabricacion").setText(anioFabricacion));
            nuevo.addContent(new Element("color").setText(color));
            nuevo.addContent(new Element("Capacidad").setText(capacidad));
            nuevo.addContent(new Element("Kilometraje").setText(kilometraje));
            
            nuevo.addContent(new Element("Numero Vin").setText(numVin));
            nuevo.addContent(new Element("Sede").setText(sede));
            nuevo.addContent(new Element("Estado").setText(estado));
            raiz.addContent(nuevo);
            //Para guardar el archivo con los nuevos datos
            XMLOutputter escribir=new XMLOutputter();
            escribir.setFormat(Format.getPrettyFormat());
            escribir.output(raiz,new FileWriter("usuariosDB.xml"));
        }catch(IOException e){
        }
    }
    
    public List cargarVehiculos() throws IOException{
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File("usuariosDB.xml");//Abre el archivo xml
        List list = null;//Asigna una lista en NULL
        try {
            Document document = (Document) builder.build( xmlFile );
            Element raiz = document.getRootElement();//Obtiene el elemento Raiz
            list = raiz.getChildren();//Obtiene los hijos de ese elemento raiz
            return list;//Retorna la lista
        } catch (JDOMException e) {
            
        }return list;
    }

    
    public void escrirbirViaje(String pSalida,String fViaje,String hInicio,String hFinal,
            String destino,ArrayList<Pasajero> pasajeros) throws IOException{
        SAXBuilder builder =new SAXBuilder();
        File xmlFile=new File("viajesDB.xml");
        try{
            Document document=(Document)builder.build(xmlFile);
            Element raiz=document.getRootElement();
            Element nuevo=new Element("Viaje");
            nuevo.addContent(new Element("Punto de salida").setText(pSalida));
            nuevo.addContent(new Element("Fecha viaje").setText(fViaje));
            nuevo.addContent(new Element("Hora de inicio").setText(hInicio));
            nuevo.addContent(new Element("Hora Final").setText(hFinal));
            nuevo.addContent(new Element("Destino").setText(destino));
            Element tLicencias=nuevo.getChild("Pasajeros");
            for(int i=0;i<pasajeros.size();i++){
                tLicencias.addContent(new Element("Nombre").setText(pasajeros.get(i).getNombreCompleto()));
                tLicencias.addContent(new Element("Correo").setText(pasajeros.get(i).getCorreo()));
                int c=(int) pasajeros.get(i).getCedula();
                tLicencias.addContent(new Element("Identificacion").setText(Integer.toString(c)));
                tLicencias.addContent(new Element("Direccion").setText(pasajeros.get(i).getDireccion1()));
                int t=(int) pasajeros.get(i).getTelefono();
                tLicencias.addContent(new Element("Identificacion").setText(Integer.toString(t)));
            }
            raiz.addContent(nuevo);
            XMLOutputter escribir=new XMLOutputter();
            escribir.setFormat(Format.getPrettyFormat());
            escribir.output(raiz,new FileWriter("usuariosDB.xml"));            
            
        }catch(JDOMException e){
        
        }  
    }

}
