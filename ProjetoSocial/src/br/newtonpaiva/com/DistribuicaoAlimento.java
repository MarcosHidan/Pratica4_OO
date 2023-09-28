package br.newtonpaiva.com;

class DistribuicaoAlimento extends Projeto {
    private String descAlimento;
    private int qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String dataInicio, String dataFim,
                                String descAlimento, int qtde) {
        super(nomeProjeto, descricao, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public boolean validaProjeto() {
        return getDataFim().isEmpty();
    }

    public String imprimeProjeto() {
        return "Nome do Projeto: " + getNomeProjeto() + "\nDescrição: " + getDescricao() +
                "\nData de Início: " + getDataInicio() + "\nData de Fim: " + getDataFim() +
                "\nDescrição do Alimento: " + descAlimento + "\nQuantidade: " + qtde;
    }
}