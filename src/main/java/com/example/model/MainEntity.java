package com.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Projet :  demo
 * Package :  com.example
 * File :  MainEntity
 * Created on : 2021, Monday 13 of September
 * Created at : 5:19 AM
 * Author name : Brice dymas
 * Author's mail : briceguemkam@gmail.com / brice.guemkam@iforce5.com
 */
@Getter
@Setter
//@Builder
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class MainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Version
    protected Long version = 0L;

    @CreatedBy
    protected String createdBy = "Dymas";

    @CreatedDate
    protected LocalDateTime createdAt = LocalDateTime.now();

}
