package kz.help_system.help_system.service.client;

import kz.help_system.help_system.exception.DataNotFound;
import kz.help_system.help_system.model.ClientInfo;
import kz.help_system.help_system.repository.ClientRepository;
import kz.help_system.help_system.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

  private final ClientRepository clientRepository;

  @Override
  public ClientInfo getClientByIin(String iin) {
    return clientRepository.findByIin(iin)
                           .map(Mapper::toClientInfo)
                           .orElseThrow(() -> new DataNotFound("XzBHi59Nh", "client", iin));
  }

  @Override
  public ClientInfo getClientById(Long id) {
    return clientRepository.findById(id)
                           .map(Mapper::toClientInfo)
                           .orElseThrow(() -> new DataNotFound("K0vJZG7og0D", "client", id));
  }

}
