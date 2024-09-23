package kz.help_system.help_system.util;

import kz.help_system.help_system.entity.ActionEntity;
import kz.help_system.help_system.entity.CategoryEntity;
import kz.help_system.help_system.entity.ClientEntity;
import kz.help_system.help_system.entity.ProductEntity;
import kz.help_system.help_system.model.ActionInfo;
import kz.help_system.help_system.model.CategoryInfo;
import kz.help_system.help_system.model.ClientInfo;
import kz.help_system.help_system.model.ProductInfo;

public class Mapper {

  public static ActionInfo toActionInfo(ActionEntity actionEntity) {
    return ActionInfo.builder()
                     .id(actionEntity.id)
                     .name(actionEntity.name)
                     .beginDate(actionEntity.beginDate)
                     .endDate(actionEntity.endDate)
                     .build();
  }

  public static CategoryInfo toCategoryInfo(CategoryEntity categoryEntity) {
    return CategoryInfo.builder()
                       .id(categoryEntity.id)
                       .name(categoryEntity.name)
                       .build();
  }

  public static ClientInfo toClientInfo(ClientEntity clientEntity) {
    return ClientInfo.builder()
                     .id(clientEntity.id)
                     .iin(clientEntity.iin)
                     .name(clientEntity.name)
                     .surname(clientEntity.surname)
                     .birthday(clientEntity.birthdate)
                     .build();
  }

  public static ProductInfo toProductInfo(ProductEntity productEntity) {
    CategoryInfo categoryInfo = CategoryInfo.builder()
                                            .id(productEntity.category.id)
                                            .name(productEntity.category.name)
                                            .build();

    return ProductInfo.builder()
                      .id(productEntity.id)
                      .name(productEntity.name)
                      .price(productEntity.price)
                      .description(productEntity.description)
                      .category(categoryInfo)
                      .build();
  }

}
