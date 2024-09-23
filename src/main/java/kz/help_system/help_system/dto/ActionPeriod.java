package kz.help_system.help_system.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ActionPeriod {

  public LocalDate beginDate;
  public LocalDate endDate;

}
