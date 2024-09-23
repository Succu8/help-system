package kz.help_system.help_system.repository;

import java.util.List;
import java.util.Optional;
import kz.help_system.help_system.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>, JpaSpecificationExecutor<ProductEntity> {

  Optional<ProductEntity> findById(Long id);

  @Query(value = "SELECT * FROM products WHERE description = :description", nativeQuery = true)
  List<ProductEntity> findByDescription(@Param("description") String description);

}
