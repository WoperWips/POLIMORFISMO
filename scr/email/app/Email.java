package scr.email.app;

public abstract class Email {
    protected String enderecoEmail;
    protected int idade;
    protected String nome;

    public Email(String enderecoEmail, int idade, String nome) {
        this.enderecoEmail = enderecoEmail;
        this.idade = idade;
        this.nome = nome;
    }

    public abstract String saudacao();

    public void enviarEmail(String mensagem) {
        String saudacaoPersonalizada = saudacao();
        System.out.println(saudacaoPersonalizada);
        System.out.println(mensagem);
    }
}

