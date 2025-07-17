import java.util.Objects;
public class Livro {

    //Atributos
    private String titulo;
    private String autor;

    //Contrutor
    Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //toString
    @Override
    public String toString() {
        return "Livro: \"" + titulo + "\" escrito por: " + autor;
    }

    // Para Set funcionar e evitar duplicados, precisamos de equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return titulo.equals(livro.titulo) && autor.equals(livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }


}