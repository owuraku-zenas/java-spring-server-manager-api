package io.melioratio.serverkeeper;

import io.melioratio.serverkeeper.enumeration.Status;
import io.melioratio.serverkeeper.model.Server;
import io.melioratio.serverkeeper.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerKeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerKeeperApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16GB", "Laptop", "http://localhost:8082/server/image/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.162", "Linux Mint", "16GB", "Tower System Unit", "http://localhost:8082/server/image/server2.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.164", "Windows 10", "16GB", "PC", "http://localhost:8082/server/image/server3.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.165", "Robot", "16GB", "RaspberryPi", "http://localhost:8082/server/image/server4.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.166", "Docker Server", "16GB", "Docker Server", "http://localhost:8082/server/image/server1.png", Status.SERVER_UP));
		};
	}

}
