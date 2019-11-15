package com.example.TestBoot;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "jpa_druid")
public class DruidEntity {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private int age;

}
