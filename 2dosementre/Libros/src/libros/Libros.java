package libros;

import java.util.*;

public class Libros {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //creas el objeto que conecta la clase libros con book
        //el objeto se llama 'datos'
        book datos = new book();
        
        //aca pones los datos 
        System.out.println("ingrese el titulo del libro:");
        datos.setTit(in.next());
        System.out.println("ingrese el nombre del autor del libro:");
        datos.setAu(in.next());
        System.out.println("año de publicación del libro");
        datos.setAño(in.nextInt());
        System.out.println("Número de páginas");
        datos.setPag(in.nextInt());
        System.out.println("Y género del libro\n");
        datos.setGene(in.next());
      
        
        //aca pones el metodo info. lo pones con el nombre del objeto(datos)
        //y luego el metodo(info)
        datos.info();
        //lo mismo pero con antiguedad
        datos.antiguedad();
        //lo mismo pero con recomendad
        System.out.println("recomiende un genero");
        datos.recomendar(in.next());
        
        

    }

}
