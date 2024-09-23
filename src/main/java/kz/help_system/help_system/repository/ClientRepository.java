package kz.help_system.help_system.repository;

import java.util.Optional;
import kz.help_system.help_system.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

  Optional<ClientEntity> findByIin(String iin);

  Optional<ClientEntity> findById(Long id);

}
