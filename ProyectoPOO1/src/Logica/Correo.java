/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import com.sun.xml.internal.fastinfoset.sax.Properties;
import java.util.Date;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Kendall Tenorio Chevez
 */
public class Correo {
    private String correo="transportec2018@gmail.com";
    private String contrasena="transporteT.2018"; 
    private static int pdfN;

    public Correo() {
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public String crearContrasena(){
        String nContrasena = null;
        String simbolo=obtenerSimboloEspecial();
        int numeroR=obtenerNumeroRandom(8,13);
        for(int i=0;i<numeroR;i++){
            if(i==obtenerNumeroRandom(8,13))
                nContrasena+=simbolo;
            else if(i%2==1)
                nContrasena+=obtenerLetra().toUpperCase();
            else
                nContrasena+=obtenerLetra().toLowerCase();
        }
        return nContrasena;
    }
    
    private int obtenerNumeroRandom(int inicio,int final1){
        return (int)(Math.random() * final1) + inicio;
    }
    
    private String obtenerSimboloEspecial(){
        String simbolosEspeciales[]={"(","!","#","$","?","@","^","~",")"};
        int numero=obtenerNumeroRandom(0,10);
        return simbolosEspeciales[numero];
    }
    private String obtenerLetra(){
        String[] abecedario={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","v","u","w","y","z"};
        return abecedario[obtenerNumeroRandom(0,26)];
    }
    
    public void enviarCorreo(String correoReceptor) throws AddressException, MessagingException{
        boolean depuracion = false;
        java.util.Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.required", "true");
        
        java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        Session mailSession = Session.getDefaultInstance(props, null);
        
        mailSession.setDebug(depuracion);
        Message msg = new MimeMessage(mailSession);
        msg.setFrom(new InternetAddress(correo));
        InternetAddress[] address = {new InternetAddress(correoReceptor)};
        msg.setRecipients(Message.RecipientType.TO, address);
        String contra=crearContrasena();
        msg.setSubject("Nuevo usuario"); msg.setSentDate(new Date());
            msg.setText("Bienevenido al incorporarse al sistema de buses del Tecnologico de Costa Rica"+
                    "\n"+"El usuario que debes usar para utilizar la aplicacion es la siguiente:"+
                    correoReceptor+"\n"+ "Tu contrasena es la siguiente"+contra);

           Transport transport=mailSession.getTransport("smtp");
           transport.connect("smtp.gmail.com", correo, contrasena);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           xml
    }
    
    public void enviarCorreoAdjunto(String pChofer,String pTelefono,String pPuntoSalida,String pFecha,String pHora,String[][] ListaViajeros){
        Properties props=new Properties();
        
    
    }
    
}
