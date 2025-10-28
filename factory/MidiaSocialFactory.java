package factory;

import adapter.InstagramAdapter;
import adapter.TikTokAdapter;
import adapter.TwitterAdapter;

import interfaces.IGerenciadorMidiaSocial;


public class MidiaSocialFactory {
    public static IGerenciadorMidiaSocial getMidiaSocial(String tipo) {
        switch (tipo.toLowerCase()) {
            case "instagram": return new InstagramAdapter();
            case "tiktok": return new TikTokAdapter();
            case "twitter": return new TwitterAdapter();
            default:
                throw new IllegalArgumentException("Tipo de mídia social desconhecido: " + tipo);
        }
    }
}
