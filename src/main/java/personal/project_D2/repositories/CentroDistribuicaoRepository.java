package personal.project_D2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import personal.project_D2.entities.CentroDistribuicao;

@Repository
public interface CentroDistribuicaoRepository extends JpaRepository<CentroDistribuicao, Long> {
}
