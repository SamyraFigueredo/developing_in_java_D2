package personal.project_D2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import personal.project_D2.entities.CentroDistribuicao;
import personal.project_D2.repositories.CentroDistribuicaoRepository;

@Service
public class CentroDistribuicaoService {

    @Autowired
    private CentroDistribuicaoRepository centroRepository;

    public List<CentroDistribuicao> listarCentrosDistribuicao() {
        return centroRepository.findAll();
    }
}
