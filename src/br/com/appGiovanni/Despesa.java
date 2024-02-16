package br.com.appGiovanni;

public class Despesa extends Transacao {

    public void adicionarDespesa(String categoria, Double valor) {
        adicionarTransacao(categoria, valor);
    }
}

