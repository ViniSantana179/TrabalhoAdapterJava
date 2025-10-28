package interfaces;
import model.Conteudo;

public interface IGerenciadorMidiaSocial {
    void postarConteudo(Conteudo conteudo);
    void removerConteudo(Conteudo conteudo);
    void atualizarConteudo(Conteudo conteudo);
}
