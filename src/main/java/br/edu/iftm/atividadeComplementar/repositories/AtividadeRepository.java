package br.edu.iftm.atividadeComplementar.repositories;

import br.edu.iftm.atividadeComplementar.domains.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {

    List<Atividade> findByNomeContaining(@Param("nome") String nome);
}
