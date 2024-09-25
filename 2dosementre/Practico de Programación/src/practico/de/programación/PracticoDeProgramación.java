package practico.de.programación;

import java.util.*;
//Integer

public class PracticoDeProgramación {
public static void main(String[] args) {
    
/*
    -Dada la clase asignatura con nombre y nota. Crear 2 métodos, una que muestre
    si la nota que tiene el objeto asignatura es exonerada. El minimo para exonerar es 8.
    -Otro método que muestre toda la infoormación junta. Crear un objeto desde la 
    clase principal
    */    
        Scanner entrada=new Scanner(System.in);
        asignatura_P1 dato=new asignatura_P1();
        
        System.out.println("¿Cómo se el nombre del estudiante?");
        dato.setNome(entrada.next());
        System.out.println("¿Cuál es la nota de " +dato.getNome()+"?");
        dato.setNota(entrada.nextInt());
        //muestra el metodo informacion 
        dato.información();
        //muestra el metodo aprobado (si paso la materia o no)
        dato.aprobado();

       
    
    
}

}
    

