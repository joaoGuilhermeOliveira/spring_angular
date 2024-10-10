package joaoguilherme.springangular.model.repository;

import joaoguilherme.springangular.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
