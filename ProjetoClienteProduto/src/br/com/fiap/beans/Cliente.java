package br.com.fiap.beans;

public class Cliente {

    // visibilidade, tipo de dados e atributos
    private int idade;  // 45
    private String nome;  // "Braufagelio"
    private String email;  // "brf@gmail.com"
    private double renda;  // 7.855

    // setters (entrada) e getters (retornat/exibir)


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
}
