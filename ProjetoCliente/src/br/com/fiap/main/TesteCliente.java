package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

public class TesteCliente {

    public static void main(String[] args) {


        // instanciar objetos
        Cliente objCliente = new Cliente();

        // entradas
        objCliente.setIdade(19);
        objCliente.setNome("Samantha");
        objCliente.setAltura(1.68);

        // saidas
        System.out.println("Idade: " + objCliente.getIdade() +
                           "\nNome: " + objCliente.getNome() +
                           "\nAltura: " + objCliente.getAltura());

    }
}
