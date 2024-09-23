package kz.help_system.help_system.controller;

import kz.help_system.help_system.model.ClientInfo;
import kz.help_system.help_system.service.client.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/client")
public class ClientController {

  private final ClientService clientService;

  @GetMapping("/{id}")
  public ResponseEntity<ClientInfo> getClient(@PathVariable("id") Long id) {
    ClientInfo client = clientService.getClientById(id);
    return client != null ? ResponseEntity.ok(client) : ResponseEntity.notFound().build();
  }

  @GetMapping("/iin/{iin}")
  public ResponseEntity<ClientInfo> getClientByIin(@PathVariable("iin") String iin) {
    ClientInfo client = clientService.getClientByIin(iin);
    return client != null ? ResponseEntity.ok(client) : ResponseEntity.notFound().build();
  }

}
