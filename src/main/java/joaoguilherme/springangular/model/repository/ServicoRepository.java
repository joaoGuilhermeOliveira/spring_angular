package joaoguilherme.springangular.model.repository;

import joaoguilherme.springangular.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
