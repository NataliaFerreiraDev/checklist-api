package br.com.checklist_api.repository;

import br.com.checklist_api.domain.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Repositório para acesso à entidade Category no banco de dados.
 */
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    Optional<CategoryEntity> findByGuid(String guid);

}
