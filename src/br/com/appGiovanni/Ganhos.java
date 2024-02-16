package br.com.appGiovanni;

public class Ganhos extends Transacao{
    public void adicionarGanhos(String categoria, Double valor) {
        adicionarTransacao(categoria, valor);
    }
}
