package ru.notification.system.projectnotice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // идентификатор
    private String productName; // название продукции
    private float volume; // объем

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "measureUnit_id")
    private MeasureUnit measureUnit; // единциа измерения. Значение из справочника
}
