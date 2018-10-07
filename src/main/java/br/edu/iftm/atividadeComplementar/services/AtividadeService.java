package br.edu.iftm.atividadeComplementar.services;

import br.edu.iftm.atividadeComplementar.domains.Atividade;
import br.edu.iftm.atividadeComplementar.repositories.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtividadeService {

    private AtividadeRepository repository;

    @Autowired
    public AtividadeService(AtividadeRepository repository) {
        this.repository = repository;
    }

    public Atividade getOne(Integer id) {
        return repository.getOne(id);
    }

    public List<Atividade> findByName(String name) {
        return repository.findByNomeContaining(name);
    }
}
