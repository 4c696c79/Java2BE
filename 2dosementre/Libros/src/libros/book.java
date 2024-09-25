package libros;

public class book {

    //ingresas los datos 
    private String tit;
    private String au;
    private int año;
    private int pag;
    private String gene;

    //getters and setter
    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public String getAu() {
        return au;
    }

    public void setAu(String au) {
        this.au = au;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    //metodos
    
    //este metodo es para mostrar los datos de una en la terminal
    public void info() {
        System.out.println("--información del libro:");
        System.out.println("-titulo: " + tit);
        System.out.println("-Autor: " + au);
        System.out.println("-Año de publicación: " + año);
        System.out.println("-Número de paginas: " + pag);
        System.out.println("-Genero: " + gene);

    }
    //este metodo es para ver que tan viejo es el libro, si el libro es mayor al
    //2004 lo pone q es viejo
    public void antiguedad() {
        if (año < 2004) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("El libro es viejo");
            System.out.println("--------------------------------------------------------------");
        } else {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Su libro de nuevo");
            System.out.println("--------------------------------------------------------------");
        }
    }

    //este metodo lo q hace es si el genero del libro es el mismo al que 
    //recomendaste (el .equals es para compara si dos String son iguales)
    public void recomendar(String genero) {

        if (gene.equals(genero)) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Te recomiendo leer el guion del padrino");

        }
    }

}
