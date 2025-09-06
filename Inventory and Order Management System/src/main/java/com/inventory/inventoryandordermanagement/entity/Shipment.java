package com.inventory.inventoryandordermanagement.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@Entity
@Table(name = "shipments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ShipmentStatus status; // PENDING, IN_TRANSIT, DELIVERED

    private Instant createdAt;
    private Instant updatedAt;

    private String trackingNumber;

    @Version
    private Integer version;

}
