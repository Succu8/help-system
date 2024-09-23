package kz.help_system.help_system.repository;

import java.util.Optional;
import kz.help_system.help_system.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

  Optional<CategoryEntity> findById(Long id);

}
