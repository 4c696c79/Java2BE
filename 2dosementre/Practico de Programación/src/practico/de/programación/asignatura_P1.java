package practico.de.programación;
/*
    -Dada la clase asignatura con nombre y nota. Crear 2 métodos, una que muestre
    si la nota que tiene el objeto asignatura es exonerada. El minimo para exonerar es 8.
    -Otro método que muestre toda la infoormación junta. Crear un objeto desde la 
    clase principal
    */  
    public class asignatura_P1 {
    private int nota;
    private String nome;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //////////////////////////////////////
    /*
    este metodo lo que hace es ver si la nota es mayor a 8 y menor a 12
    y te muestra un mensaje  de que si aprobo o no
    */
    public void aprobado(){
        if (nota>=8 && nota<=12) {
            System.out.println("Asignatura exonerada");
        
        }else{

            System.out.println("Asignatura no exonerada");
  
        }       
}
    //este metodo muestra los el nombre y la nota el "\n" es para saltearse un 
    //renglon
    public void información(){
        System.out.println("\nEl alumno "+nome+" tiene "+nota+" en la asignatura");
        
        
    }
    
    
    
    
    
    
    }