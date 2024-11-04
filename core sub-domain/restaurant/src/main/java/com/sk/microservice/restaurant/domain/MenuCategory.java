package com.sk.microservice.restaurant.domain;

import com.sk.microservice.restaurant.config.jpa.Auditable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "menu_categories")
public class MenuCategory extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String alias;

    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    private String icon;

    private Boolean isAvailable;

    @OneToMany(mappedBy = "menuCategory")
    private List<MenuItem> menuItems;

}