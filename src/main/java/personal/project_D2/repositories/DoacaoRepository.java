package personal.project_D2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.project_D2.entities.Doacao;

import java.util.List;

public interface DoacaoRepository extends JpaRepository<Doacao, Long> {
  
    List<Doacao> findByCentroDistribuicaoId(Long centroDistribuicaoId);
    List<Doacao> findByTipo(String tipo);
}
