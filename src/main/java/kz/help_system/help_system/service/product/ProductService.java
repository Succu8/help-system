package kz.help_system.help_system.service.product;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import kz.help_system.help_system.dto.ProductFilter;
import kz.help_system.help_system.model.ProductInfo;

public interface ProductService {

  ProductInfo getProductById(Long id);

  List<ProductInfo> getProductsByActionPeriod(Date beginDate, Date endDate);

  ProductInfo getProductByDescription(String description);

  ProductInfo getProductByFilter(ProductFilter filter);

}
