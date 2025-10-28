package api;
import model.Conteudo;

public class TwitterApi {

    public void criarTweet(Conteudo conteudo) {
        System.out.println("Tweet criado: " + conteudo.getTitulo());
    }

    public void apagarTweet(Conteudo conteudo) {
        System.out.println("Tweet apagado: " + conteudo.getTitulo());
    }

    public void modificarTweet(Conteudo conteudo) {
        System.out.println("Tweet modificado: " + conteudo.getTitulo());
    }

}
