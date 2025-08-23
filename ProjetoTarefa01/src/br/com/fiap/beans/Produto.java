package br.com.fiap.beans;

public class Produto {

    // tipo de dados e atibutos
    int codigo;
    String tipo;
    String marca;
    double valor;

    // metodos setters (entradas)
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    // metodos getters (retornar\exibir)
    public int getCodigo() {
        return codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public String getMarca() {
        return marca;
    }
    public double getValor() {
        return valor;
    }
}
