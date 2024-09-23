package kz.help_system.help_system.controller;

import kz.help_system.help_system.model.ActionInfo;
import kz.help_system.help_system.service.action.ActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/action")
public class ActionController {

  private final ActionService actionService;

  @GetMapping("/{id}")
  public ResponseEntity<ActionInfo> getActionById(@PathVariable("id") Long id) {
    ActionInfo action = actionService.getActionById(id);
    return action != null ? ResponseEntity.ok(action) : ResponseEntity.notFound().build();
  }

}
