package com.server.services;

import com.server.domain.Server;

import java.io.IOException;
import java.util.Collection;
import java.util.Optional;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Optional<Server> get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
