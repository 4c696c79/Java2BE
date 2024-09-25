/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author bru
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//crear la clase persona que tiene como atributos nombre, cedula y edad
    //ademas tiene un metodo que es el comportamiento de la persona que es 
    //hablar.
    //se pide: crear los geters and seters necesarios y crear dos objetos persona
    //desde la clase principal cargar datos y mostrar datos
   
    Scanner entrada=new Scanner(System.in);
   Gato persona=new Gato();
    Gato personita=new Gato();
    System.out.println("Cual e sua nome?");
    persona.setNombre(entrada.next());
    System.out.println("nombre para el metodo");
    personita.setNombre(entrada.next());
    System.out.println("su edad");
    persona.setEdad(entrada.nextInt());
    System.out.println("su cedula");
    persona.setCedula(entrada.nextInt());
    
    System.out.println("su  nombre "+persona.getNombre()+"su edad "+persona.getEdad()+"su cedula es :V"+persona.getCedula());
    System.out.println("");
    persona.hablar();
    System.out.println("");
    personita.lol(personita);    }
    
}
