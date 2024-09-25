package kz.help_system.help_system.repository;

import java.util.Optional;
import kz.help_system.help_system.entity.ActionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<ActionEntity, Long> {

  Optional<ActionEntity> findById(Long id);

}
