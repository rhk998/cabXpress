package com.example.cabXpress.model;

import com.example.cabXpress.Enum.Cabtype;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    String cabNo;

    String cabModel;

    Cabtype cabtype;

    double fareperkm;

    boolean available;

    @OneToOne
    @JoinColumn
    Driver driver;
}
