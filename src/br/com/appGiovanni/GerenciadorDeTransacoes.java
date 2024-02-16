package br.com.appGiovanni;

import java.util.ArrayList;

public class GerenciadorDeTransacoes {
    private final ArrayList<Transacao> listaDeTransacoes;

    public GerenciadorDeTransacoes() {
        this.listaDeTransacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        listaDeTransacoes.add(transacao);
    }

    public void mostrarTransacoesRecentes() {
        for (Transacao transacao : listaDeTransacoes) {
            transacao.mostrarTransacoesRecentes();
        }
    }
}