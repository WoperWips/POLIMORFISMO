package scr.email.app; // Declaração do pacote

public class Professor extends Email {
    private final String titulo;

    public Professor(String enderecoEmail, int idade, String nome) {
        super(enderecoEmail, idade, nome);
        this.titulo = "Prof.";
    }

    @Override
    public String saudacao() {
        return "Olá " + this.titulo + " " + this.nome + "!";
    }
}
