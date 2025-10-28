import model.Conteudo;

public class Main {
    public static void main(String[] args) {
        GerenciadorMidiaSocial gerenciador = new GerenciadorMidiaSocial();

        Conteudo conteudo1 = new Conteudo("Lançamento do Produto", "Confira nosso novo lançamento!");
        Conteudo conteudo2 = new Conteudo("Dia de Treino", "Foto do treino de hoje no estúdio 💪");
        Conteudo conteudo3 = new Conteudo("Desafio de Dança", "Participe do nosso desafio de dança!");

        System.out.println("\n===== TWITTER =====");
        gerenciador.postar("twitter", conteudo1);
        gerenciador.atualizar("twitter", conteudo1);
        gerenciador.remover("twitter", conteudo1);

        System.out.println("\n===== INSTAGRAM =====");
        gerenciador.postar("instagram", conteudo2);
        gerenciador.atualizar("instagram", conteudo2);
        gerenciador.remover("instagram", conteudo2);

        System.out.println("\n===== TIKTOK =====");
        gerenciador.postar("tiktok", conteudo3);
        gerenciador.atualizar("tiktok", conteudo3);
        gerenciador.remover("tiktok", conteudo3);
    }
}
