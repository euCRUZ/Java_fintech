package br.com.appGiovanni;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class GerenciadorDeTransacoes {

    private ArrayList<Transacao> listaDeTransacoes;
    private ArrayList<Transacao> listaDeDespesas;
    private ArrayList<Transacao> listaDeReceitas;

    public GerenciadorDeTransacoes() {
        this.listaDeTransacoes = new ArrayList<>();
        this.listaDeDespesas = new ArrayList<>();
        this.listaDeReceitas = new ArrayList<>();
    }

    public void adicionarTransacao(String receita_Ou_Despesa, String categoria, Double valor) {
        Transacao transacao = new Transacao(receita_Ou_Despesa, categoria, valor);
        listaDeTransacoes.add(transacao);

        if (receita_Ou_Despesa.equals("Despesa")) {
            listaDeDespesas.add(transacao);
        } else if (receita_Ou_Despesa.equals("Receita")) {
            listaDeReceitas.add(transacao);
        } else {
            System.out.println("Tipo de transação inválido");
        }
    }

    public void mostrarTransacoesRecentes() {
        DecimalFormat df = new DecimalFormat("#.00");
        for (Transacao transacao : listaDeTransacoes) {
            System.out.println(transacao.getTipo() + " - " + transacao.getCategoria() + ": R$" + df.format(transacao.getValor()));
        }
    }

    public void mostrarDespesa() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Despesas:");
        for (Transacao transacao : listaDeDespesas) {
            System.out.println(" - " + transacao.getCategoria() + ": R$" + df.format(transacao.getValor()));
        }
    }

    public void mostrarReceita() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("\nReceitas:");
        for (Transacao transacao : listaDeReceitas) {
            System.out.println(" - " + transacao.getCategoria() + ": R$" + df.format(transacao.getValor()));
        }
    }

}