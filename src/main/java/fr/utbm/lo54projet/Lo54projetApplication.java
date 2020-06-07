package fr.utbm.lo54projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
public class Lo54projetApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lo54projetApplication.class, args);
	}
}
