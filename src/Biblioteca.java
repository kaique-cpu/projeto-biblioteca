import java.util.ArrayList;
public class Biblioteca {
    
    private ArrayList<Livro> acervo = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("\n--- Usuário cadastrado --- \n" + usuario);
    }

    public void cadastrarLivro(Livro livro) {
        if (!acervo.contains(livro)) {
            acervo.add(livro);
            System.out.println("\n--- Livro cadastrado --- \n" + livro);
        } else {
            System.out.println("Livro já existe no acervo.");
        }
    }

    public void emprestarLivro(String tituloLivro, String nomeUsuario) {
        Livro livroEncontrado = null;
        for (Livro livro : acervo) {
            if (livro.getTitulo().equalsIgnoreCase(tituloLivro)) {
                livroEncontrado = livro;
                break;
            }
        }

        if (livroEncontrado == null) {
            System.out.println("Livro não encontrado no acervo.");
            return;
        }

        if (estaEmprestado(livroEncontrado)) {
            System.out.println("Livro já está emprestado.");
            return;
        }

        Usuario usuarioEncontrado = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nomeUsuario)) {
                usuarioEncontrado = usuario;
                break;
            }
        }

        if (usuarioEncontrado == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        emprestimos.add(new Emprestimo(livroEncontrado, usuarioEncontrado));
        System.out.println("\nLivro emprestado com sucesso!");
    }

    public void devolverLivro(String identificador) {
    for (Emprestimo e : emprestimos) {
        Livro livro = e.getLivro();

        // Verifica se o identificador é igual ao título ou ao ISBN
        if (livro.getTitulo().equalsIgnoreCase(identificador) || 
            livro.getIsbn().equalsIgnoreCase(identificador)) {

            emprestimos.remove(e); // Remove o empréstimo
            System.out.println("Livro devolvido com sucesso!");
            return;
        }
    }
    // Se nenhum livro for encontrado
    System.out.println("Erro! Digite novamente");
    }

    public void relatorioEmprestados() {
        System.out.println("\n--- Livros Emprestados ---");
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum livro emprestado.");
        } else {
            for (Emprestimo e : emprestimos) {
                System.out.println(e);
            }
        }
    }

    public void relatorioDisponiveis() {
        System.out.println("\n--- Livros Disponíveis ---");
        boolean disponivel = false;
        for (Livro livro : acervo) {
            if (!estaEmprestado(livro)) {
                System.out.println(livro);
                disponivel = true;
            }
        }
        if (!disponivel) {
            System.out.println("Nenhum livro disponível.");
        }
    }

    public void listarUsuarios() {
        System.out.println("\n--- Usuários Cadastrados ---");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }

    private boolean estaEmprestado(Livro livro) {
        for (Emprestimo e : emprestimos) {
            if (e.getLivro().equals(livro)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Livro> getAcervo() {
        return acervo;
    }
}