package personal.project_D2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import personal.project_D2.entities.Doacao;

@Repository
public interface DoacaoRepository extends JpaRepository<Doacao, Long> {
}
