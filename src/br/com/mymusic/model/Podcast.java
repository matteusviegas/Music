package br.com.mymusic.model;

public class Podcast extends Audio {

    private String apresentador;
    private String programa;
    private int numeroEpisodio;
    private double duracao; // em minutos ou segundos
    private String convidados; // pode virar lista depois

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getConvidados() {
        return convidados;
    }

    public void setConvidados(String convidados) {
        this.convidados = convidados;
    }

    @Override
    public int getClassificacao() {
if(this.getCurtidas() > 500){
    return 10;
        }else {
    return 8;
        }
    }
}
