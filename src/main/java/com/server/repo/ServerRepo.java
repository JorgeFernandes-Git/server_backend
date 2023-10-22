package com.server.repo;

import com.server.domain.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress); // this is possible because we declare ip address as unique
}
