package br.newtonpaiva.com;

class TrabalhoVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String dataInicio, String dataFim,
                              String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto() {
        return duracaoTrabalho > 2;
    }

    public String imprimeProjeto() {
        return "Nome do Projeto: " + getNomeProjeto() + "\nDescrição: " + getDescricao() +
                "\nData de Início: " + getDataInicio() + "\nData de Fim: " + getDataFim() +
                "\nTipo de Trabalho: " + tipoTrabalho + "\nDuração do Trabalho: " + duracaoTrabalho + " horas";
    }
}