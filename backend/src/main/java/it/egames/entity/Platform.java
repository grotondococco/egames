package it.egames.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Set;

@Entity
@Data
public class Platform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpu;
    private String ram;
    private String support;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "FK_PRODUCER"))
    private Producer producer;
    @Basic
    private Date productionDate;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "platform_input_type",
            joinColumns = @JoinColumn(name = "platform_id", foreignKey = @ForeignKey(name = "FK_PLATFORM_INPUT_TYPE_MTM")),
            inverseJoinColumns = @JoinColumn(name = "input_type_id", foreignKey = @ForeignKey(name = "FK_INPUT_TYPE_MTM")))
    private Set<InputType> inputTypeSet;
}
