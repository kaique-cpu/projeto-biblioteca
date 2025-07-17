import java.util.Scanner;
public class Emprestimo {

    //Atributos
    private Livro livro;
    private Usuario usuario;

    //Construtor
    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
    }

    //Getters
    public Livro getLivro() {
        return livro;
    }
    public Usuario getUsuario() {
        return usuario;
    }

    //toString
    @Override
    public String toString() {
        return livro + " emprestado para: " + usuario.getNome();
    }

    //Método de Emprestimo de Livros
    public static void emprestar(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Título do livro: ");
            String tituloEmprestimo = scanner.nextLine();

            System.out.print("Nome do usuário: ");
            String nomeUsuario = scanner.nextLine();

            biblioteca.emprestarLivro(tituloEmprestimo, nomeUsuario);
            break;
        }
    }

    //Método para devolução de Livros
    public static void devolver(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Título do livro para devolução: ");
            String tituloDevolucao = scanner.nextLine();
            biblioteca.devolverLivro(tituloDevolucao);
            break;
        }
    }

}