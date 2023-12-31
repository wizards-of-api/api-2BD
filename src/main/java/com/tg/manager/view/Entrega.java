package com.tg.manager.view;

import com.tg.manager.controller.SubmitController;

import lombok.Data;

@Data
public class Entrega {
    private int id;
    private String atividade;
    private String tipoTG;
    private String dataInicial;
    private String dataFinal;
    private String tgModelo;

    public String getTgModelo() {
        return tgModelo;
    }
    public void setTgModelo(String tgModelo) {
        this.tgModelo = tgModelo;
    }
    public String getAtividade() {
        return atividade;
    }
    public Entrega(Integer id, String atividade, String tipoTG, String dataInicial, String dataFinal, String tgModelo) {
        this.id = id;
        this.atividade = atividade;
        this.tipoTG = tipoTG;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.tgModelo = tgModelo;
    }
    public Entrega(String atividade, String tipoTG, String dataInicial, String dataFinal, String tgModelo) {
    this.atividade = atividade;
    this.tipoTG = tipoTG;
    this.dataInicial = dataInicial;
    this.dataFinal = dataFinal;
    this.tgModelo = tgModelo;
}
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public String getTipoTG() {
        return tipoTG;
    }
    public void setTipoTG(String tipoTG) {
        this.tipoTG = tipoTG;
    }
    public String getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }
    public String getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }
}    