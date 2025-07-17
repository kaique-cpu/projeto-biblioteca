import java.util.Scanner;
public class App {
public static void main(String[] args) {

    Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Cadastrar Livro");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Mostrar Livros Emprestados");
            System.out.println("6. Mostrar Livros Disponíveis");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    Cadastros Usuario = new Cadastros();
                    Usuario.cadastroUsuario(biblioteca);
                    break;

                case "2":
                    Cadastros Livro = new Cadastros();
                    Livro.cadastroLivro(biblioteca);
                    break;

                case "3":
                    Emprestimo.emprestar(biblioteca);
                    break;

                case "4":
                    Emprestimo.devolver(biblioteca);
                    break;

                case "5":
                    biblioteca.relatorioEmprestados();
                    break;

                case "6":
                    biblioteca.relatorioDisponiveis();
                    break;

                case "7":
                    executando = false;
                    System.out.println("\nEncerrando...");
                    break;

                default:
                    System.out.println("\nOpção inválida.");
            }
        }
        scanner.close();
    }
}