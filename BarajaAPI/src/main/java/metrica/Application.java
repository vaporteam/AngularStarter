package metrica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
@ComponentScan({ "controller", "security" })
@EntityScan("pojos")
@EnableJpaRepositories("pojos")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
