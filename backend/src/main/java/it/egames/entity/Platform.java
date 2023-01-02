package it.egames.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Platform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Producer producer;
    @Basic
    private Date productionDate;
    @OneToOne
    private TechnicalFeatures technicalFeatures;

}
