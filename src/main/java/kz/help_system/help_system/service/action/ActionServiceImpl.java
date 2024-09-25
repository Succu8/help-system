package kz.help_system.help_system.service.action;

import kz.help_system.help_system.exception.DataNotFound;
import kz.help_system.help_system.model.ActionInfo;
import kz.help_system.help_system.repository.ActionRepository;
import kz.help_system.help_system.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActionServiceImpl implements ActionService {

  private final ActionRepository actionRepository;

  @Override
  public ActionInfo getActionById(Long id) {
    return actionRepository.findById(id)
                           .map(Mapper::toActionInfo)
                           .orElseThrow(() -> new DataNotFound("KRvdyxR", "action", id));
  }

}
