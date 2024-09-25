
package trabajo;

import java.util.*;

public class Trabajo {
public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            ArrayList<alumno>clase=new ArrayList(); 
            
            for (int i = 1; i < 3; i++) {
                alumno nuevo=new alumno();
                System.out.println("ingrese nombre");
                nuevo.setNome(in.next());
                System.out.println("ingrese la cedula");
                nuevo.setCi(in.nextInt());
                System.out.println("ingrese la nota");
                nuevo.setNota(in.nextInt());
                clase.add(nuevo);
                
    }
            for (int i = 1; i < 3; i++) {
                System.out.println("escriba el ci del alumno que quiera buscar");
                clase.size(i).
                
                System.out.println(clase.get(i).getNome());
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
    }
    
}
