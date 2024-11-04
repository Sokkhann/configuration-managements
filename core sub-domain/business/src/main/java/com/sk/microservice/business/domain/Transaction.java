package com.sk.microservice.business.domain;

import com.sk.microservice.business.config.jpa.Auditable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "transactions")
public class Transaction extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String type; // delivery | pickup | restaurant_reservation | hotel_booking

    @Column(unique = true, nullable = false)
    private String alias;
}
