package kz.help_system.help_system.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductInfo {

  public Long         id;
  public CategoryInfo category;
  public String       name;
  public Double       price;
  public String       description;

}
