package com.proyectfullstack.cardatabase.domain;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Owner {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long ownerid;
    private String firstname;
    private String lastname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    @Getter
    @Setter
    private List<Car> cars;

}
