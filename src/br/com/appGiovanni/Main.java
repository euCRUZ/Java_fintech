package br.com.appGiovanni;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciadorDeTransacoes gerenciador = new GerenciadorDeTransacoes();

        gerenciador.adicionarTransacao("Despesa", "Compras", 850.58);
        gerenciador.adicionarTransacao("Despesa", "Alimentação", 100.0);
        gerenciador.adicionarTransacao("Receita", "Salário", 2000.0);

        gerenciador.mostrarDespesa();

        //gerenciador.mostrarReceita();
        //gerenciador.mostrarTransacoesRecentes();
        batata doce!
    }
}