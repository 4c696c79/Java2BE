/*  Igual que en la clase libro en donde dice 'public class revistas'
tenes q poner al lado extends y el nombe de la clase padre (publicaciones).

    Y tambien pones los getter and setters y te aparecera los datos de 
revista (tipo) y los de publicaciones (nombre, año y prestado).
luego ve al jframe que se llama 'jframe' XD.*/
public class revistas extends pushpush{
    //datos de revista
    private String tipo;
//////////////////////////////////////////////////////////////////////////
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public boolean isPretado() {
        return pretado;
    }

    public void setPretado(boolean pretado) {
        this.pretado = pretado;
    }
    
    
    
}
