package com.inventory.inventoryandordermanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String email;
    private String phone;
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    private Instant createdAt;
    private Instant updatedAt;

    @Version
    private Integer version;

}
