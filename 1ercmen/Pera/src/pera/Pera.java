package pera;
import java.util.*;
public class Pera {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Persona datos=new Persona();
        System.out.println("Ingrese nombre de la persona:");
        datos.setNombre(in.next());
        System.out.println("Ingrese la edad:");
        datos.setEdad(in.nextInt());
        
        System.out.println("Ingrese la altura en cm: ");
        datos.setAltura(in.nextInt());
        
        
    }
    
}
