package br.com.fiap.beans;

public class Produto {

    private int codigo;
    private String tipo;
    private String marca;
    private int quantidade;
    private double valor;

    //metodo construtor vazio
    public Produto(){
    }

    //metodo construtor com parametro cheio
    public Produto(int codigo, String tipo, String marca, int quantidade, double valor){
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "PRODUTO" +
                "\nCodigo= " + codigo +
                "\nTipo= '" + tipo + '\'' +
                "\nMarca= '" + marca + '\'' +
                "\nQuantidade= " + quantidade +
                "\nValor= R$" + valor +
                "\nTOTAL= R$" + calcularTotal();
    }

    //calcularTotal
    public double calcularTotal(){
        return quantidade * valor;
    }
}
