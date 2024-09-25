/*  Primero hay que tener en cuenta que en donde dice "public class libro"
a lado pones 'extends' y el nombre de la clase publicaciones (mi caso pushpush).

    En la clase libro los datos que solo va tener la clase libro
(tema y autor) los creas como siempre. Pero cuando vas a poner el 
getters and setters te va a parecer los datos de libro (tema y autor)
y los datos de publicaciones (nombre, año y prestado), y tendras los 
getter and setters de libro y publicaciones en la clase de libro, los
datos q se vayan a ingresar seran de libros.
luego ve a revistas y hace lo mismo*/
public class libra extends pushpush{
    //datos de libros
    private String tema;
    private String autor;
/////////////////////////////////////////////////////////////////////////////
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
