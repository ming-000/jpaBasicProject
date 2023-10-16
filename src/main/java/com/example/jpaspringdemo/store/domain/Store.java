package com.example.jpaspringdemo.store.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;
@Entity
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "store_id", columnDefinition = "bytea")
    private UUID storeId;
}
