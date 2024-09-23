package kz.help_system.help_system.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientInfo {

  public Long   id;
  public String iin;
  public String name;
  public String surname;
  public Date   birthday;

}
