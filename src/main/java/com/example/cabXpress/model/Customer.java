package com.example.cabXpress.model;

import com.example.cabXpress.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     int id;

     String name;

     String age;
    @Column(unique = true,nullable = false)

     String emailid;

     Gender gender;

     @CreationTimestamp
    Date registeredOn;
}
