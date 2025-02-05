package br.com.checklist_api.domain;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

/**
 * Classe base para entidades do sistema.
 * Contém o campo {@code guid} que serve como identificador único global.
 * Esta classe é anotada com {@code @MappedSuperclass}, permitindo que suas
 * propriedades sejam herdadas por outras entidades JPA.
 */
@Data
@MappedSuperclass
public class BaseEntity {

    private String guid;

}
