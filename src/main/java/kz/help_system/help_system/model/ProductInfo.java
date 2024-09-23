package kz.help_system.help_system.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductInfo {

  public Integer id;
  public Integer categoryId;
  public String  name;
  public Integer price;
  public String  description;

}
