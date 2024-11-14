package com.ecommerce.skater.data;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Timestamp;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "product")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@EntityListeners(AuditingEntityListener.class)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "seller_account_id", nullable = false)
    private Integer sellerAccountId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "description", nullable = false, length = 300)
    private String description;

    @Column(name = "price", nullable = false, length = 50)
    private String price;

    @Column(name = "max_quantity", nullable = false, length = 50)
    private String maxQuantity;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;

    @Column(name = "tags", nullable = false, length = 500)
    private String tags;

    @CreatedDate
    private Timestamp createdate;

}