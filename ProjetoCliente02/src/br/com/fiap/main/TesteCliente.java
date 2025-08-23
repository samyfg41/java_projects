package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

public class TesteCliente {

    public static void main(String[] args) {

        // instanciar objetos
        Cliente objCliente = new Cliente();

        // entradas
        objCliente.setIdade(19);
        objCliente.setNome("Samantha");
        objCliente.setEmail("samyfg@gmail.com");
        objCliente.setRenda(600);

        // saidas
        System.out.println("Idade: " + objCliente.getIdade() +
                           "\nNome : " + objCliente.getNome() +
                           "\nEmail: " + objCliente.getEmail() +
                           "\nRenda: R$ " + objCliente.getRenda());
    }
}
