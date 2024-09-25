package kz.help_system.help_system.service.product;

import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.Subquery;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import kz.help_system.help_system.dto.ProductFilter;
import kz.help_system.help_system.entity.CategoryEntity;
import kz.help_system.help_system.entity.ProductEntity;
import kz.help_system.help_system.exception.DataNotFound;
import kz.help_system.help_system.model.CategoryInfo;
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
                            .orElseThrow(() -> new DataNotFound("0b1OH3nQ", "product", id));
  }

  @Override
  public List<ProductInfo> getProductsByActionPeriod(Date beginDate, Date endDate) {
    return productRepository.findProductsByActionDateRange(beginDate, endDate).stream()
                            .map((ProductEntity res) -> ProductInfo.builder()
                                                                   .id(res.id)
                                                                   .category(CategoryInfo.builder()
                                                                                         .id(res.category.id)
                                                                                         .name(res.category.name)
                                                                                         .build())
                                                                   .name(res.name)
                                                                   .price(res.price)
                                                                   .description(res.description)
                                                                   .build())
                            .toList();
  }

  @Override
  public ProductInfo getProductByDescription(String description) {
    return productRepository.findByDescription(description).stream().findFirst()
                            .map(Mapper::toProductInfo)
                            .orElseThrow(() -> new DataNotFound("qJroMra5WK", "product", description));
  }

  @Override
  public ProductInfo getProductByFilter(ProductFilter filter) {
    Specification<ProductEntity> spec = (root, query, criteriaBuilder) -> {
      List<Predicate> predicates = new ArrayList<>();

      if (filter != null) {
        if (filter.categoryId != null) {
          Subquery<CategoryEntity> subquery           = Objects.requireNonNull(query).subquery(CategoryEntity.class);
          Root<CategoryEntity>     categoryEntityRoot = subquery.from(CategoryEntity.class);

          subquery.select(categoryEntityRoot)
                  .where(criteriaBuilder.equal(categoryEntityRoot.get("id"), filter.categoryId));

          predicates.add(criteriaBuilder.in(root.get("category")).value(subquery));
        }

        if (filter.price != null) {
          predicates.add(criteriaBuilder.equal(root.get("price"), filter.price));
        }

        if (filter.description != null) {
          predicates.add(criteriaBuilder.equal(root.get("description"), filter.description));
        }
      }

      return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    };

    return Optional.ofNullable(productRepository.findAll(spec).getFirst())
                   .map(Mapper::toProductInfo)
                   .orElseThrow(() -> new DataNotFound("TbRHbCus7", "product", filter.toString()));
  }

}
