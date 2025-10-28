import interfaces.IGerenciadorMidiaSocial;
import model.Conteudo;
import factory.MidiaSocialFactory;

public class GerenciadorMidiaSocial {
    public void postar(String plataforma, Conteudo conteudo) {
        IGerenciadorMidiaSocial midiaSocial = MidiaSocialFactory.getMidiaSocial(plataforma);
        System.out.println("Postando conteúdo...");
        midiaSocial.postarConteudo(conteudo);
    }
    
    public void remover(String plataforma, Conteudo conteudo) {
        IGerenciadorMidiaSocial midiaSocial = MidiaSocialFactory.getMidiaSocial(plataforma);
        System.out.println("Removendo conteúdo...");
        midiaSocial.removerConteudo(conteudo);
    }
    
    public void atualizar(String plataforma, Conteudo conteudo) {
        IGerenciadorMidiaSocial midiaSocial = MidiaSocialFactory.getMidiaSocial(plataforma);
        System.out.println("Atualizando conteúdo...");
        midiaSocial.atualizarConteudo(conteudo);
    }
}