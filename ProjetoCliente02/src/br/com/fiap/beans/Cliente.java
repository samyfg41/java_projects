package br.com.fiap.beans;

public class Cliente {

    // tipo de dados e atributos
    int idade;
    String nome;
    String email;
    double renda;

    // metodos setters (entrada)
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }

    // metodos getters(retornar\exibir)
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public double getRenda() {
        return renda;
    }
}
