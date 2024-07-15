package personal.project_D2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import personal.project_D2.entities.Abrigo;
import personal.project_D2.repositories.AbrigoRepository;

@Service
public class AbrigoService {

	@Autowired
	private AbrigoRepository abrigoRepository;

	public Abrigo salvarAbrigo(Abrigo abrigo) {
		return abrigoRepository.save(abrigo);
	}

	public List<Abrigo> listarAbrigos() {
		return abrigoRepository.findAll();
	}

	public Abrigo buscarPorId(Long id) {
		return abrigoRepository.findById(id).orElse(null);
	}

	public void deletarAbrigo(Long id) {
		abrigoRepository.deleteById(id);
	}
}
