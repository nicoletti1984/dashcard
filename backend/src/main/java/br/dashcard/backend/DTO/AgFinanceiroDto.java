package br.dashcard.backend.DTO;

import br.dashcard.backend.model.AgFinanceiro;

// DTO - Data Transfer Object

public class AgFinanceiroDto {
    private String nome_agente;
    private Float volume_transacional;

    public AgFinanceiroDto(AgFinanceiro agFinanceiro) {
        this.nome_agente = agFinanceiro.getNome_agente();
        this.volume_transacional = agFinanceiro.getVolume_transacional();
    }

    public String getNome_agente() {
        return nome_agente;
    }

    public void setNome_agente(String nome_agente) {
        this.nome_agente = nome_agente;
    }

    public Float getVolume_transacional() {
        return volume_transacional;
    }

    public void setVolume_transacional(Float volume_transacional) {
        this.volume_transacional = volume_transacional;
    }
    
    
}
