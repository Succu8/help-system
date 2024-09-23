package kz.help_system.help_system.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ProductFilter {

  public String categoryId;
  public Double price;
  public String description;

}
