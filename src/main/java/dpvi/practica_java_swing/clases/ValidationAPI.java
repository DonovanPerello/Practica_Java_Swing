/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpvi.practica_java_swing.clases;

/**
 *
 * @author donih
 */
public class ValidationAPI {
    
    public static boolean validarMajusculaInicial(String text) {
        if (text == null || text.isEmpty()) {
            return false; 
        }
        
        char primeraLetra = text.charAt(0);
        
        return Character.isUpperCase(primeraLetra);
    }
}