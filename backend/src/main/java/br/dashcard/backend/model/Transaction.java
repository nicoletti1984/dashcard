package br.dashcard.backend.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "mtb310_transaction")
@Getter @Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transacao")
    private int id_transacao;

    @Column(name = "data_hora", nullable = false)
    private Timestamp data_hora;

    @Column(name = "dispositivo", nullable = false)
    private int dispositivo;
    
    @Column(name = "valor_solic", nullable = false)
    private float valor_solic;
    
    @Column(name = "valor_aut", nullable = false)
    private float valor_aut;

    @Column(name = "status", nullable = false)
    private int status;

    @ManyToOne
    @JoinColumn(name = "id_agente")
    @JsonIgnoreProperties("transaction")
    private AgFinanceiro agFinanceiro;
    
}
