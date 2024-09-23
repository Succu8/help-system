package kz.help_system.help_system.service.client;

import kz.help_system.help_system.model.ClientInfo;

public interface ClientService {

  ClientInfo getClientByIin(String iin);

  ClientInfo getClientById(Long id);

}
