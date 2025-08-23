package br.com.fiap.beans;

public class Cliente {

    // tipo de dados e atributos
    int idade;
    String nome;
    double altura;

    // metodos setters (entrada)
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // metodos getters (retornar\exibir)
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public double getAltura() {
        return altura;
    }
}
