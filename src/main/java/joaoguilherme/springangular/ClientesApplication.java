package joaoguilherme.springangular;

import joaoguilherme.springangular.model.entity.Cliente;
import joaoguilherme.springangular.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

	/*@Bean
	public CommandLineRunner run(@Autowired ClienteRepository repository) {
		return args -> {
			Cliente cliente = Cliente.builder().cpf("12345678912").nome("Joaquim").build();
			repository.save(cliente);
		};
	}*/

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
