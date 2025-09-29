package br.com.mymusic.model;

public class Audio {

    private String titulo;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao; // ex: livre, +12, +16, etc.

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir(){
        this.totalDeReproducoes++;
    }
}
