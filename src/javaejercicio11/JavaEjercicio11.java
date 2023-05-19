/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio11;
import java.util.Scanner;
/**
 *
 * @author kcand
 */
public class JavaEjercicio11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int flag=0;
       String resultado;
       String cadena="";
       do{
           System.out.println("Ingrese una frase que termine en punto final.");
           cadena = leer.nextLine();
           int longitud=cadena.length();
           //System.out.println(longitud);
           char letra;
           letra = cadena.charAt(longitud-1);
           //System.out.println(letra);
           if (letra=='.'){
               flag=1;
           } else {
           }
       }while(flag==0);
       resultado = codificar(cadena);
       System.out.println(resultado);
    }
    
    public static String codificar(String cadena){
        int longitud=cadena.length();
        String cadenaResultado="";
        char letra;
        for(int i=0;i<longitud;i++){
            letra = cadena.charAt(i);
                switch (letra){
                    case 'a':
                        cadenaResultado = cadenaResultado + '@';
                        break;
                    case 'e':
                        cadenaResultado = cadenaResultado + '#';
                        break;
                    case 'i':
                        cadenaResultado = cadenaResultado + '$';
                        break;
                    case 'o':
                        cadenaResultado=cadenaResultado + '%';
                        break;
                    case 'u':
                        cadenaResultado=cadenaResultado + '*';
                        break;
                    default:
                        cadenaResultado=cadenaResultado+letra;
                }
            }
        return cadenaResultado;
        }
        
}
