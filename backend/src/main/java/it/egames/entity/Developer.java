package it.egames.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @Basic
    private Date birthDate;
    @ManyToOne
    private SoftwareHouse softwareHouse;
}
