public class Autor {

    //Atributos
    private String nome;
    private int idade;
    
    //Construtor
    public Autor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //toString 
    @Override
    public String toString() {
        return "Autor: " + nome + "Idade: " + idade;
    }
}