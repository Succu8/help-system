package kz.help_system.help_system.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActionInfo {

  public Integer id;
  public String  name;
  public Date    beginDate;
  public Date    endDate;
  public Integer productId;

}
