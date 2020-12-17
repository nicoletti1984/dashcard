package br.dashcard.backend.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.dashcard.backend.model.AgFinanceiro;

public interface AgFinanceiroDAO extends CrudRepository<AgFinanceiro, Integer> {
    /* public AgFinanceiro findByNomeAgenteFinanceiro(String nome_agente); */

    @Query(value="Select nome_agente, volume_transacional from mtb310_ag_financeiro where id_agente = :cod", nativeQuery = true)
    public Object buscarAgFinanceirosPorId(@Param("cod") Integer codigo);
}