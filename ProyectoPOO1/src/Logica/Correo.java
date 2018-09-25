/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Kendall Tenorio Chevez
 */
public class Correo {
    private String correo="transportec2018@gmail.com";
    private String contrasena="transporteT.2018"; 

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
}
