package com.example.tiago.exames;

/**
 * Created by tiago on 25/04/18.
 */

public class Exame {

    private String nome;
    private String faixa;
    private String descricao;

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        this.faixa = faixa;
    }

    public String getDesc() {
        return descricao;
    }

    public void setDesc(String desc) {
        this.descricao = desc;
    }
}
