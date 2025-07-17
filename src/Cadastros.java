import java.util.Scanner;
public class Cadastros {

    //Método de Cadastro de Usuários
    public void cadastroUsuario(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nNome: ");
            String nome = scanner.nextLine();
            if(nome.length()<3) {
                System.out.println("Erro! O nome deve ter ao menos 3 caracteres.");
                continue;
            }
            System.out.print("Email: ");
            String email = scanner.nextLine();
            if(email.length()<6) {
                System.out.println("Erro! O email deve ter ao menos 6 caracteres.");
                continue;
            }
            System.out.print("Senha: ");
            String senha = scanner.nextLine();
            if(senha.length()<8) {
                System.out.println("Erro! A senha deve ter ao menos 8 caracteres.");
                continue;
            }
            Usuario u = new Usuario(nome, email, senha);
            biblioteca.cadastrarUsuario(u);
            break;

        }

    }

    //Método de Cadastro de Livros
    public void cadastroLivro(Biblioteca biblioteca) {
        Scanner scanner =  new Scanner(System.in);
        while(true) {
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            if(autor.length()<3) {
                System.out.println("Erro! O nome do autor deve ter ao menos 3 caracteres.");
                continue;
            }
            Livro l = new Livro(titulo, autor);
            biblioteca.cadastrarLivro(l);
            break;

        }

    }

}