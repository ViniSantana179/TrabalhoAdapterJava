package api;

import model.Conteudo;

public class TikTokApi {

    public void criarVideo(Conteudo conteudo) {
        System.out.println("Vídeo criado no TikTok: " + conteudo.getTitulo());
    }

    public void deletarVideo(Conteudo conteudo) {
        System.out.println("Vídeo deletado do TikTok: " + conteudo.getTitulo());
    }

    public void editarVideo(Conteudo conteudo) {
        System.out.println("Vídeo editado no TikTok: " + conteudo.getTitulo());
    }
}
