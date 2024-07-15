package personal.project_D2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personal.project_D2.entities.Doacao;
import personal.project_D2.repositories.DoacaoRepository;

@Service
public class DoacaoService {

    private final DoacaoRepository doacaoRepository;

    @Autowired
    public DoacaoService(DoacaoRepository doacaoRepository) {
        this.doacaoRepository = doacaoRepository;
    }

    public Doacao salvarDoacao(Doacao doacao) {
        return doacaoRepository.save(doacao);
    }
}
