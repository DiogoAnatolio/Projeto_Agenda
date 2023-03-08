package br.com.newton.linguagem.aula03;

public class Agenda {
    public static void main(String[] args) {


        Contato conta1 = new Contato("Rafaella", "123456");
        Contato conta2 = new Contato("Joao", "318989952");
        Contato conta3 = new Contato("Rafaella", "3189871147");

        Telefone telefone1 = new Telefone("YPhone", "vermelha", conta2);
        Telefone telefone2 = new Telefone("S20", "branca", conta3);

        telefone1.Tocar("Samba");

    }
}
