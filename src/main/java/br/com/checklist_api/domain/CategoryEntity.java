package br.com.checklist_api.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**
 * Representa uma categoria no sistema de checklist.
 * Cada categoria possui um nome único e pode conter vários itens de checklist.
 * Herda o campo {@code guid} da classe {@link BaseEntity}.
 */
@Data
@Entity
@Table(indexes = {@Index(name = "IDX_GUID_CAT", columnList = "guid")})
public class CategoryEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<ChecklistItemEntity> checklistItem;

}
