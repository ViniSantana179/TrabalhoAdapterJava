package model;

import java.sql.Date;

public class Conteudo {
    private String titulo;
    private String descricao;
    private Date criadoEm;
    private Date atualizadoEm;


    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.criadoEm = new Date(System.currentTimeMillis());
        this.atualizadoEm = new Date(System.currentTimeMillis());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        this.atualizadoEm = new Date(System.currentTimeMillis());
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
        this.atualizadoEm = new Date(System.currentTimeMillis());
    }
}
