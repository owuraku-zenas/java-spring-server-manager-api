package io.melioratio.serverkeeper.repo;

import io.melioratio.serverkeeper.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
