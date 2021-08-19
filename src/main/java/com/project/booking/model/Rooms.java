
package com.project.booking.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="rooms")
public class Rooms {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long room_id;
    private int price;
    private String room_type;
    
    @OneToMany
    private Set<Reservation> reservation;
    
    @OneToMany
    private Set<Hotel> hotel;
    
    @OneToOne
    @JoinColumn(name="option_id")
    private RoomOptions roomOptions;
    
    
}
