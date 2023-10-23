package ru.notification.system.projectnotice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // идентификатор
    private String sender; // отправитель
    private String recipient; // получатель
    private LocalDateTime dateCargo; // дата поступления груза
    private LocalDateTime dateNotice; // дата создания уведомления
    private String status; // статус уведомления

    private String product; // продукция
    private String additionalDetails; // дополнительная информация

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "checkpoint_id")
    private Checkpoint checkpoint; // пункт пропуска из справочника
}
