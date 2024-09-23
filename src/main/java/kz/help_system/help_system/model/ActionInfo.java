package kz.help_system.help_system.model;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActionInfo {

  public Long              id;
  public String            name;
  public Date              beginDate;
  public Date              endDate;
  public List<ProductInfo> products;

}
