/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arr;

import java.util.*;

/**
 *
 * @author fenix
 */
public class Arr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // el ejercicio es para ver si un numero es mayor a 10
       Scanner in=new Scanner(System.in);
       //aca creas el arraylist. el Integer es para que el array
       //pueda guardar datos de tipo int (los arraylist lee clases y/o metodos)
        ArrayList <Integer> o=new ArrayList();
        
        
        //este for es para ingresar los datos y lo guarda en el arrylist
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese 5 números");
            //el o.add guarda los numeros puestos
            o.add(in.nextInt());
             
        }
        //este for es para mostrar los datos
        for (int i = 0; i < 1; i++) {
            // o.get es para mostrar los datos
            if (o.get(i)>=10) {
                 System.out.println("Hay un numero q es mayor a 10 es el "+ "'"+o.get(i)+"'");
            }else{
                System.out.println("No hay un numero que es mayor a 10");
            }
            
        }
        
    }
    
}
