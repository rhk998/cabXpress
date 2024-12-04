package com.example.cabXpress.model;

import com.example.cabXpress.Enum.BookingStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    String pickup;

    String destination;

    String bookingId;

    @CreationTimestamp
    Date bookedAt;

    @UpdateTimestamp
    Date updatedAt;

    double totalFare;

    double totalDistance;

    BookingStatus status;

    @ManyToOne
    @JoinColumn
    Customer customer;

    @ManyToOne
    @JoinColumn
    Driver driver;
}
