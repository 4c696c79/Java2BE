package parangaricumiricuaro;
 import  java.util.*; 

public class Parangaricumiricuaro {

   public static void main(String[] args) {
       
       //pone los datos de la persona predefinidos
       String minombre="Pablo";
        int micedula=1234;
        //aca es  el objeto persona pero entre '()' pones los datos 
        // micedula y minombre
        persona nueva=new persona(minombre, micedula);
       
        //aca mostras en la terminal dlos datos
       System.out.println(nueva.getNome());
       System.out.println(nueva.getCi());
       
       
    }
    
}
