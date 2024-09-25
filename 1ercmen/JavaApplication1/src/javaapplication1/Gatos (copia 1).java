package javaapplication1;
public class Gatos {
    //crear la clase persona que tiene como atributos nombre, cedula y edad
    //ademas tiene un metodo que es el comportamiento de la persona que es
    //hablar.
    //se pide: crear los getters and setters necesarios y crear dos objetos persona
   
    //desde la clase principal cargar datos y mostrar datos
    //agregar un nuevo metodo que permita mostrar el nombre de otro objeto persona
    //que se lo pase como para metro
    

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
    public void lol(Gatos p){
    System.out.println("say mu name... "+p.getNombre());
}
    
     
    
    
    
}
