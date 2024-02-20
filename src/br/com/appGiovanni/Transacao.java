package br.com.appGiovanni;

public class Transacao {
    private String categoria;
    private Double valor;
    private String tipo;

    public Transacao(String tipo, String categoria, Double valor) {
        this.tipo = tipo;
        this.categoria = categoria;
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }
}