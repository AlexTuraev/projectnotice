package ru.notification.system.projectnotice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class MeasureUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // идентификатор
    private String measureName; // название единица измерения

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "measureUnit")
    private Set<Product> products;
}
