package devopswork;

import devopswork.controller.KubeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = KubeRepo.class)
public class  DevopsWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsWorkApplication.class, args);
	}

}
