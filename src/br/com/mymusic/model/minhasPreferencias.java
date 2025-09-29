package br.com.mymusic.model;

public class minhasPreferencias {
    public void incluir(Audio audio){
        if(audio.getClassificacao() >=8){
            System.out.println(audio.getTitulo()+ "Veja oq esta fazendo sucesso!");
        }else {
            System.out.println(audio.getTitulo()+"veja os o pessoal acompanha!");
        }
    }
}
