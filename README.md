Este projeto implementa um sistema unificado de gerenciamento de redes sociais utilizando o padrão de projeto Adapter, com suporte a Twitter, Instagram e TikTok.

O objetivo é simular a integração com diferentes APIs de redes sociais — cada uma com métodos e estruturas próprias — e oferecer uma interface única e padronizada para postagem, atualização e remoção de conteúdo.

Padrões de Projeto Utilizados

Strategy: define dinamicamente qual estratégia (plataforma) será usada para gerenciar o conteúdo, permitindo trocar de rede social em tempo de execução.

Adapter: adapta cada API de rede social para a interface comum IGerenciadorMidiaSocial.

Factory Method: instancia automaticamente o Adapter (estratégia) correto conforme a plataforma informada.

⚙️ Estrutura do Projeto
├── adapter/        # Adaptadores para cada rede social (Instagram, TikTok, Twitter)
├── api/            # Simulações das APIs das plataformas
├── factory/        # Fábrica responsável por instanciar o Adapter correto
├── interfaces/     # Interface comum de gerenciamento de mídias sociais
├── model/          # Modelo de dados (Conteudo)
├── GerenciadorMidiaSocial.java  # Classe unificadora (fachada)
└── Main.java       # Classe principal para testes

Diagrama de Classes:

<img width="845" height="683" alt="image" src="https://github.com/user-attachments/assets/ecf5968e-1fad-49a2-8734-bbf6c1d6d126" />
