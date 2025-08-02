import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class Cadastro {

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
            if(titulo.isEmpty()) {
                System.out.println("Erro! O titulo do livro deve conter algum caractere");
                continue;
            }

            System.out.print("Nome autor: ");
            String nomeAutor = scanner.nextLine();
            if(nomeAutor.length()<3) {
                System.out.println("Erro! O nome do autor deve ter ao menos 3 caracteres.");
                continue;
            }
            System.out.println("Idade autor: ");
            int idadeAutor = scanner.nextInt();
            scanner.nextLine();
            if(idadeAutor<0 && idadeAutor>130) {
                System.out.println("Erro! A idade do autor deve estar entre 0 e 130");
                continue;
            }
            Autor autor = new Autor(nomeAutor, idadeAutor);
            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();
            if(isbn.length()<6) {
                System.out.println("Erro! O isbn deve ter mais de 5 caracteres.");
                continue;
            }
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine();
            if(ano<1800 || ano>2025) {
                System.out.println("Erro! O ano deve estar entre 1800 e 2025.");
                continue;
            }
            System.out.print("Editora: ");
            String editora = scanner.nextLine();
            if(editora.length()<3) {
                System.out.println("Erro! A editora deve ter ao menos 3 caracteres.");
                continue;
            }
            Livro l = new Livro(titulo, autor, isbn, ano, editora);
            biblioteca.cadastrarLivro(l);
            break;

        }

    }

}