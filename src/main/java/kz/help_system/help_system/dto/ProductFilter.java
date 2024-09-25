package kz.help_system.help_system.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ProductFilter {

  public Long categoryId;
  public Double price;
  public String description;

  @Override
  public String toString() {
    return "ProductFilter{" +
      "categoryId=" + categoryId +
      ", price=" + price +
      ", description='" + description + '\'' +
      '}';
  }
}
