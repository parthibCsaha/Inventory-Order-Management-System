package com.inventory.inventoryandordermanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "audit_logs")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String entityName;

    private Long entityId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AuditActionType actionType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "performed_by")
    private User performedBy;

    private Instant timestamp;

    @Column(columnDefinition = "TEXT")
    private String details;

    @Version
    private Integer version;

}
