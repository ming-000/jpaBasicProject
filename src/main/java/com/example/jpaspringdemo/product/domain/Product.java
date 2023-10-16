package com.example.jpaspringdemo.product.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "product_id", columnDefinition = "bytea")
    private UUID productId;
    private UUID storeId;
    private String productName;
    private String productPrice;
    private String productDescription;

}
