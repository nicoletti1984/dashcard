package br.dashcard.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dashcard.backend.dao.AgFinanceiroDAO;
import br.dashcard.backend.model.AgFinanceiro;

@RestController
@CrossOrigin("*")
@RequestMapping("/agFinanceiro")
public class AgFinanceiroController {

    @Autowired // injeção de dependência
    private AgFinanceiroDAO dao;

    @GetMapping("/all")
    public List<AgFinanceiro> listarTodos() {
        List<AgFinanceiro> lista = (List<AgFinanceiro>) dao.findAll();

        return lista;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Object> buscarAgFinanceiroPersonalizado(@PathVariable int id) {
        Object agFinanceiroFinded = dao.buscarAgFinanceirosPorId(id);

        if(agFinanceiroFinded != null){
            return ResponseEntity.ok(agFinanceiroFinded);
        }
        return ResponseEntity.notFound().build();
    }
    
}
