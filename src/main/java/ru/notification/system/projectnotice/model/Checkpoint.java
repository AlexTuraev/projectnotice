package ru.notification.system.projectnotice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Checkpoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // идентификатор
    private String name; // название пункта пропуска

    @OneToMany(fetch = FetchType.LAZY, mappedBy="checkpoint")
    private Set<Notification> notifications;
}
