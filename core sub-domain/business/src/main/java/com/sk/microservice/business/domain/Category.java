package com.sk.microservice.business.domain;

import com.sk.microservice.business.config.jpa.Auditable;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categories")
public class Category extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false, length = 60)
    private String name;

    @Column(unique = true, nullable = false, length = 100)
    private String alias;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String icon;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Category parentCategory;
}