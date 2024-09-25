/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author bru
 */
class Gato {
   public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }
 public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    private int edad;
    private String nombre;
    private int cedula;
    
    
    public void hablar(){
        System.out.println("Hablando :V");
        
        
        
    }
    public void lol(Gato p){
    System.out.println("say mu name... "+p.getNombre());
}  
}
