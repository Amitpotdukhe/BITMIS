package mis.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"mis.controller"})
public class BitmisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitmisApplication.class, args);
	}

}
