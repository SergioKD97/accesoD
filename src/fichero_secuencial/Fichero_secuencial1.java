/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero_secuencial;

import java.io.BufferedWriter;
import java.io.FileWriter;


/**
 *
 * @author Sergio
 */
public class Fichero_secuencial1 {
    

    public static void main(String[] args) {
        
        grabarDatos("C:\\Users\\Sergio\\Desktop\\UFV\\Acceso a Datos\\fichero1.txt","pedro y juan");
        
    }
    public static void menu(){
    
    
}
    
    public static void grabarDatos(String archivo, String datos){
        try{

FileWriter fw = new FileWriter(archivo,false);

BufferedWriter bw = new BufferedWriter(fw);

bw.write(datos + "\n");
 bw.close();
 }
 catch(java.io.IOException ioex){}
} 
}