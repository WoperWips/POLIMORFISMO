package scr.email.app;

public class Aluno extends Email {

    public Aluno(String enderecoEmail, int idade, String nome) {
        super(enderecoEmail, idade, nome);
    }

    @Override
    public String saudacao() {
        return "Olá Aluno " + this.nome + "!";
    }
}

