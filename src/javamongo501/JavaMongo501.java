/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamongo501;

/**
 *
 * @author pasit
 */
public class JavaMongo501 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Correction conexion = new Correction();
       
       conexion.Mostrar();
       conexion.insertar("Nadar");
        System.out.println("Otro");
       conexion.Mostrar();
        System.out.println("Otro Mas");
       //conexion.Actualizar("Nadar", "Brincar");
       conexion.eliminar("Brincar");
       conexion.Mostrar();
    }
    
}
