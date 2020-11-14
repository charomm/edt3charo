/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author Maria
 */
public class Main {
    public static void main(String[] args) 
    {
        String nombre = "";
        String texto = "";
        if (args.length >= 1) {
           nombre = args[0];
        }
        if (args.length >= 3) {
            texto = veredicto(args[1], args[2]);
        }
        System.out.println("Estudiante " + args[0] + " : " + texto);
    }
    static String veredicto(String valor1, String valor2) {
        int modulos = Integer.valueOf(valor1);  // modulos
        int horas = Integer.valueOf(valor2);    // horas semanales;
        if (modulos == horas) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (horas < modulos){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";        
    }
}
