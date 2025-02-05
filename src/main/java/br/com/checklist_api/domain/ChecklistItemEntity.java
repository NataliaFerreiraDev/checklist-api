package br.com.checklist_api.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

/**
 * Representa um item de checklist.
 * Cada item possui uma descrição, status de conclusão, prazos e está associado a uma categoria.
 * Herda o campo {@code guid} da classe {@link BaseEntity}.
 */
@Data
@Entity(name = "ChecklistItem")
@Table(indexes = {@Index(name = "IDX_GUID_CK_IT", columnList = "guid")})
public class ChecklistItemEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long checklistItemId;

    private String description;

    private Boolean isCompleted;

    private LocalTime deadLine;

    private LocalTime postedDate;

    @ManyToOne
    private CategoryEntity category;

}
