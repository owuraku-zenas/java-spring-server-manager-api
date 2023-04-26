package io.melioratio.serverkeeper.service;

import io.melioratio.serverkeeper.model.Server;

import java.io.IOException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server ping(String idAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server udpate(Server server);
    Boolean delete(Long id);

}
