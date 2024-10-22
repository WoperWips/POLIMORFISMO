package scr.email.app;

public class Testeemail {
    public static void main(String[] args) {
        Email professor = new Professor("alan.turing@universidade.com", 40, "Alan Turing");
        Email aluno = new Aluno("joseph@escola.com", 20, "Joseph");

        String mensagem1 = "Atenciosamente Alan Turing";
        String mensagem2 = "Atemciosamente Joseph ";

        // Enviar email para professor
        professor.enviarEmail(mensagem1);

        // Enviar email para aluno
        aluno.enviarEmail(mensagem2);
    }
}
