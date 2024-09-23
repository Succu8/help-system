package kz.help_system.help_system.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import kz.help_system.help_system.entity.ActionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ActionRepository extends JpaRepository<ActionEntity, Long> {

  Optional<ActionEntity> findById(Long id);

  @Query(value = "SELECT a FROM actions a WHERE a.beginDate <= :endDate AND a.endDate >= :beginDate", nativeQuery = true)
  List<ActionEntity> findActionsByPeriod(@Param("beginDate") LocalDate beginDate, @Param("endDate") LocalDate endDate);

}
