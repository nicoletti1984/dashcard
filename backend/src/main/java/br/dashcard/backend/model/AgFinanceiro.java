package br.dashcard.backend.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // será armazenado no BD
@Table(name = "mtb310_ag_financeiro")
@Getter @Setter @NoArgsConstructor
public class AgFinanceiro {

    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1,2,3...
    @Column(name = "id_agente")
    private int id_agente;

    @Column(name = "nome_agente", length = 100, nullable = false)
    private String nome_agente;

    @Column(name = "volume_transacional", nullable = false)
    private float volume_transacional;

    @OneToMany(mappedBy = "agFinanceiro")
    @JsonIgnoreProperties("agFinanceiro")
    private List<Transaction> transaction;

    public AgFinanceiro(String nome_agente) {
        this.nome_agente = nome_agente;
    }
   
}
