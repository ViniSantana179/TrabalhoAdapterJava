package adapter;

import interfaces.IGerenciadorMidiaSocial;
import api.TwitterApi;


public class TwitterAdapter implements IGerenciadorMidiaSocial {
    private TwitterApi twitterApi;

    public TwitterAdapter() {
        this.twitterApi = new TwitterApi();
    }

    public void postarConteudo(model.Conteudo conteudo) {
        twitterApi.criarTweet(conteudo);
    }

    public void removerConteudo(model.Conteudo conteudo) {
        twitterApi.apagarTweet(conteudo);
    }

    public void atualizarConteudo(model.Conteudo conteudo) {
        twitterApi.modificarTweet(conteudo);
    }
}
