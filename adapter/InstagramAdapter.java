package adapter;

import interfaces.IGerenciadorMidiaSocial;
import api.InstagramApi;

public class InstagramAdapter implements IGerenciadorMidiaSocial {
    
    private InstagramApi instragramApi;

    public InstagramAdapter() {
        this.instragramApi = new InstagramApi();
    }

    public void postarConteudo(model.Conteudo conteudo) {
        instragramApi.publicarPostagem(conteudo);
    }

    public void removerConteudo(model.Conteudo conteudo) {
        instragramApi.deletarPostagem(conteudo);
    }

    public void atualizarConteudo(model.Conteudo conteudo) {
        instragramApi.editarPostagem(conteudo);
    }
}
