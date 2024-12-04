package com.example.cabXpress.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    String name;

    int age;

    long mobNo;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    List<Booking> bookings = new ArrayList<>();

    @OneToOne(mappedBy = "driver", cascade = CascadeType.ALL)
    Cab cab;
}
