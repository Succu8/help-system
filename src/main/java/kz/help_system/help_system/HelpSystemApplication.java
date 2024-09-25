package kz.help_system.help_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "kz.help_system.help_system.entity")
public class HelpSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelpSystemApplication.class, args);
	}

}
