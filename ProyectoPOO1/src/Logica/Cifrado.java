package Logica;

/**
 *
 * @author kendall Tenorio Chévez
 */
public class Cifrado {
    //Charset de caracteres cuando se cifra
   private String charset1 = "1234567890!#$%&/()=¿?¡_-+*:";
   //Charset de caracteres cuando se descifra
   private String charset2 = "abcdefghijklmnopqrstuvwxyz ";
    
   /**
    * Metodo que recibe un texto y cifra el contenido de
    * acuerdo a los charset definidos
    * @param texto
    * @return texto
    */
   public String cifrar(String texto){
      //Convierto a minuscula las letras del alfabeto que existan en el texto
      texto = texto.toLowerCase();
      //Reemplazo los caracteres del charset2 con los del charset1
      for (int i = 0; i < charset2.length(); i++) {
         texto = texto.replace(charset2.charAt(i), charset1.charAt(i));
      }
      //Retorno el texto cifrado con el charset2
      return texto;
   }
    
   /**
    * Metodo que recibe un texto y descifra el contenido de
    * acuerdo a los charset definidos
    * @param texto
    * @return texto
    */
   public String descifrar(String texto){
      //Convierto a minuscula las letras del alfabeto que existan en el texto
      texto = texto.toLowerCase();
      //Reemplazo los caracteres del charset1 con los del charset2
      for (int i = 0; i < charset1.length(); i++) {
         texto = texto.replace(charset1.charAt(i), charset2.charAt(i));
      }
      //Retorno el texto cifrado con el charset2
      return texto;
   }
}
