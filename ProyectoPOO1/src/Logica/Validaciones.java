/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jdom2.Element;

/**
 *
 * @author kenda
 */
public class Validaciones {
    private static final String PATTERN_EMAIL = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9"
            + "_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    
    /**
     * Método para validar el correo
     * @param correo
     * @return retorna falso si es inválido
     */
    public boolean validarCorreo(String correo){
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
    
    /**
     * Verifica si el número de carné que se ingresará ya está en el archivo
     * @param carnet Tipo ingresado por el usuario
     * @return True: Si el tipo esta en el archivo o False: si el parametro no se encuentra
     */
    /*public boolean carnetRepetido(String carnet){
       estudiantes verXml = new estudiantes();
        List list=verXml.cargarEstudiantes();
        for ( int j = 0; j < list.size(); j++ ){//Se recorre cada nodo padre
            Element campo = (Element)list.get( j );
            String nombre = campo.getChildTextTrim("Carnet");
            if(carnet.equals(nombre))//Equals para verifica si es el mismo
                return true;
        }return false;
    }*/
    
    public boolean validarCEntero(String numero){
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }   
    }
    
    
}
