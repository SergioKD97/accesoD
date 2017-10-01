/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero_secuencial;
import java.io.*;
import java.util.Scanner;


/**
 *
 * @author Sergio
 */
public class Fichero_secuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in); 
            System.out.print("Indique el fichero a buscar");
            String fichero = sc.nextLine();
            leerDatos(fichero);
            
        } catch(Exception e)  {
              System.out.println("FUNCIÓN NO ENCONTRADA");
    }
    }
    
    public static void leerDatos(String archivo){
        try{
            String texto= new String();
            FileReader fr = new FileReader(archivo);
            BufferedReader entrada = new BufferedReader(fr);
//            String s;
//            
//            while((s = entrada.readLine() )!=null)
//                texto += s + "\n";
//            System.out.println("\nDatos leidos del archivo con READLINE:"
//                     + " \n" + texto + "tamaño del fichero: \n"+texto.length());
//          
            System.out.print((char) entrada.read());
            entrada.close();
        
        }
        
        catch(java.io.FileNotFoundException fnfex){   
        System.out.println("Archivo no encontrado!!!" + fnfex); 
        }
        catch(java.io.IOException ioex){} 
            
        }
    
    
    


}









