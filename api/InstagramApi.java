package api;
import model.Conteudo;

public class InstagramApi {

    public void publicarPostagem(Conteudo conteudo) {
        System.out.println("Postagem publicada no Instagram: " + conteudo.getTitulo());
    }

    public void deletarPostagem(Conteudo conteudo) {
        System.out.println("Postagem deletada do Instagram: " + conteudo.getTitulo());
    }

    public void editarPostagem(Conteudo conteudo) {
        System.out.println("Postagem editada no Instagram: " + conteudo.getTitulo());
    }
}
