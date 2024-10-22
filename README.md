Polimorfismo:Nesse reprositorio foi feito com o intuito de auxiliar logica de progamação orientada objeto.

🚀 Começando

Sistema de Envio de Emails em Java
Este projeto demonstra um sistema simples de envio de emails em Java, utilizando o conceito de herança e polimorfismo. As classes são organizadas em pacotes, representando diferentes tipos de destinatários de email (Professor e Aluno). Cada destinatário tem uma saudação personalizada de acordo com sua categoria, e o sistema acrescenta essa saudação ao corpo da mensagem ao enviar o email.

Estrutura do Projeto
Pacote email: Contém a classe base Email e suas subclasses Professor e Aluno, que implementam saudações personalizadas.
Pacote app: Contém a classe TesteEmail, que cria instâncias de Professor e Aluno e simula o envio de emails.
Classes Principais:
Email: Classe abstrata que define os atributos e o método enviarEmail(), com um método abstrato saudacao() para personalizar a mensagem.
Professor: Subclasse de Email, onde a saudação inclui o título "Prof.".
Aluno: Subclasse de Email, onde a saudação inclui apenas "Aluno" seguido do nome.
TesteEmail: Classe responsável por testar o envio de emails para diferentes tipos de destinatários.

📋 Pré-requisitos Visual Studio + extensões do Java

🔧 Instalação Cada programa pode ser executado individualmente. Basta compilar o código em seu ambiente Java e executar o arquivo correspondente. Alguns programas utilizam a classe Scanner para permitir a entrada de dados pelo usuário.

🛠️ Construído com Ferramentas utilizadas e bibliotecas Visual Studio

📌 Versão Versão 1.0

✒️ Autores Herick Marlon - Trabalho Inicial - Polimorfismo