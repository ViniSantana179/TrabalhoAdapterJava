package adapter;

import interfaces.IGerenciadorMidiaSocial;
import api.TikTokApi;

public class TikTokAdapter implements IGerenciadorMidiaSocial {
    
    private api.TikTokApi tikTokApi;

    public TikTokAdapter() {
        this.tikTokApi = new api.TikTokApi();
    }

    @Override
    public void postarConteudo(model.Conteudo conteudo) {
        tikTokApi.criarVideo(conteudo);
    }

    @Override
    public void removerConteudo(model.Conteudo conteudo) {
        tikTokApi.deletarVideo(conteudo);
    }

    @Override
    public void atualizarConteudo(model.Conteudo conteudo) {
        tikTokApi.editarVideo(conteudo);
    }
    
}
