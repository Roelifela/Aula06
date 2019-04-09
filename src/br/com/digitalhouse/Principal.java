package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Luby", "Pequeno", "Scotish-Terrier");

        System.out.println("Esse cachorro é mamífero? "+ cachorro.ehMamifero());
        System.out.println("Seu nome é " + cachorro.nome + ", porte " + cachorro.getTamanho() + ", raça "+ cachorro.getRaca());


    }


}
