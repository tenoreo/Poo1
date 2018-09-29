package Logica;


import org.apache.commons.codec.digest.DigestUtils;
/**
 *
 * @author kendall Tenorio Chévez
 */
public class Cifrado {
    private String codigoHash;
    private String contrasena;
    
    public String getCodigoHash(){
        return codigoHash;
    }
    public void setCodigoHash(String pCodigoHash){
        codigoHash=pCodigoHash;
    }
    /*
    *
    */
    public String encriptar(String texto){
        return DigestUtils.sha1Hex(texto);
    }
    /*
    *
    */
    public String descriptar(String texto){
    
    }
}
