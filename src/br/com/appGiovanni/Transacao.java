package br.com.appGiovanni;
import java.text.DecimalFormat;
import java.util.*;

public class Transacao {

    private Map<String, Double> transacao;
    ArrayList<Map<String, Double>> listaDeTransacoes;

    public Transacao() {
        this.listaDeTransacoes = new ArrayList<>();
    }

    public void adicionarTransacao(String categoria, Double valor) {


        this.transacao = new HashMap<>();
        transacao.put(categoria, valor);

        // Adiciona a transacao na lista de transacoes
        listaDeTransacoes.add(transacao);
    }

    public void mostrarTransacoesRecentes() {
        DecimalFormat df = new DecimalFormat("#.00");

        // para cada item da lista de transacoes, imprime a categoria e o valor
        for (Map<String, Double> transacao : listaDeTransacoes) {
            for (Map.Entry<String , Double> entry : transacao.entrySet()) {
                System.out.println(entry.getKey() + ": R$" + df.format(entry.getValue()));
            }
        }
    }
}

