package co.maxbi.db.dao.interfaces;


import co.maxbi.db.entity.Client;

import java.util.List;
import java.util.Set;

public interface ClientsDAO  {
    boolean add(Client order);
    boolean remove(Client order);
    Set<Client> allClients();
}
