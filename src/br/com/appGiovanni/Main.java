package br.com.appGiovanni;

public class Main {
    public static void main(String[] args) {

        Despesa transacao = new Despesa();
        Ganhos ganhos = new Ganhos();

        transacao.adicionarDespesa("Alimentação", 100.00);

        ganhos.adicionarGanhos("Salário", 2000.00);




    }
}