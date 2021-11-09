package mis.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"mis.controller", "mis.services"})
@EntityScan("mis.entity")
@EnableJpaRepositories("mis.dao")
public class BitmisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitmisApplication.class, args);
	}

}
