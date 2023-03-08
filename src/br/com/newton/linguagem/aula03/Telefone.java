package br.com.newton.linguagem.aula03;

public class Telefone {

    public String marca;

    public String cor;

    public Contato contato;

    public String estiloMusical;



    public Telefone(String marca, String cor, Contato cont){
        this.marca = marca;
        this.cor = cor;
        this.contato = contato;
    }

    public Telefone(){
    }
    public void Tocar(String estiloMusical){
        System.out.println("Tocando" + estiloMusical);
    }

    public void Ligar(Contato cont){

        System.out.printf("Ligando para %s - %s\n", cont.nome, cont.numero);

    }
}
