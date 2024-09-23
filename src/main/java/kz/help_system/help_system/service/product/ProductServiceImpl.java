package kz.help_system.help_system.service.product;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import kz.help_system.help_system.dto.ProductFilter;
import kz.help_system.help_system.entity.ProductEntity;
import kz.help_system.help_system.model.ProductInfo;
import kz.help_system.help_system.repository.ProductRepository;
import kz.help_system.help_system.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  @Override
  public ProductInfo getProductById(Long id) {
    return productRepository.findById(id)
                            .map(Mapper::toProductInfo)
                            .orElseThrow(() -> new RuntimeException(
                              "9l0k0A5kww:: not found product by id=" + id));
  }

  @Override
  public List<ProductInfo> getProductsByActionPeriod(LocalDate beginDate, LocalDate endDate) {
    return null;
  }

  @Override
  public ProductInfo getProductByDescription(String description) {
    return productRepository.findByDescription(description).stream().findFirst()
                            .map(Mapper::toProductInfo)
                            .orElseThrow(() -> new RuntimeException(
                              "xNDRfgh84K:: not found product by description=" + description));
  }

  @Override
  public ProductInfo getProductByFilter(ProductFilter filter) {
    Specification<ProductEntity> spec = Specification.where(
                                                       filter.categoryId == null ? null
                                                         : (Specification<ProductEntity>) (root, query, criteriaBuilder) ->
                                                         criteriaBuilder.equal(root.get("categoryId"), filter.categoryId))
                                                     .and(filter.price == null ? null
                                                            : (Specification<ProductEntity>) (root, query, criteriaBuilder) ->
                                                       criteriaBuilder.equal(root.get("price"), filter.price))
                                                     .and(filter.description == null ? null
                                                            : (Specification<ProductEntity>) (root, query, criteriaBuilder) ->
                                                       criteriaBuilder.like(root.get("description"),
                                                                            "%" + filter.description + "%"));

    return Optional.ofNullable(productRepository.findAll(spec).getFirst())
                   .map(Mapper::toProductInfo)
                   .orElseThrow(() -> new RuntimeException(
                     "GWG2tjFhV:: not found product by specification=" + spec));
  }

}
