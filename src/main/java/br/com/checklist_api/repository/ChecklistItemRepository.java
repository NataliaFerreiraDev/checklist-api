package br.com.checklist_api.repository;

import br.com.checklist_api.domain.ChecklistItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Repositório para acesso à entidade Checklist Item no banco de dados.
 */
public interface ChecklistItemRepository extends JpaRepository<ChecklistItemEntity, Long> {

    Optional<ChecklistItemEntity> findByGuid(String guid);

}
