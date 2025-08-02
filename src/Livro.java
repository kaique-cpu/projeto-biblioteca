import java.util.Objects;
public class Livro {

    //Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private int ano;
    private String editora;

    //Contrutor
    Livro(String titulo, String autor, String isbn, int ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
        this.editora = editora;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getAno() {
        return ano;
    }
    public String getEditora() {
        return editora;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    //toString
    @Override
    public String toString() {
        return "Livro: \"" + titulo + "\"  escrito por: " + autor + "  ISBN: " + isbn + "  Ano: " + ano + "  Editora: " + editora;
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