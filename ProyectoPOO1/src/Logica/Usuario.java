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
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.Document;
import org.jdom2.Element;


/**
 *
 * @author kenda
 */
public class Usuario {
    private String nombre;
    private String departamento;
    private String nombreUsuario;
    private long telefono;
    private String contrasenia;

    public Usuario(String nombre, String departamento, String nombreUsuario, long telefono) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.nombreUsuario = nombreUsuario;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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
    
    public void crearXmlUsuario(String pNombre,String pNombreUsuario,String pTelefono,String pContrasenia,String pDepartamento){
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
}
