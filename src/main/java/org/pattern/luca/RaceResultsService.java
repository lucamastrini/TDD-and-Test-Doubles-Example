package org.pattern.luca;

import java.util.Collection;
import java.util.HashSet;


/**
 * Created by @luca on 15/10/16.
 * Immagination is more important then knowledge. @AI
 */
public class RaceResultsService {

    private Collection<Client> clients = new HashSet<Client>();

    public void addSubscriber(Client client) {
        clients.add(client);
    }

    public void send(Message message) {
        for (Client client : clients) {
            client.receive(message);
        }
    }

    public void removeSubscriber(Client client) {
        clients.remove(client);
    }
}
