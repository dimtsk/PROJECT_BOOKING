
package com.project.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="hotels")
public class Hotel {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long hotel_id;
    @Column(nullable=false, length=30)
    private String name;
    @Column(nullable=false)
    private double user_rating;
    @Column(nullable=false, length=30)
    private String stars;//********************
    @Column(nullable=false, length=300)
    private String description;
    @Column(nullable=false, length=40)
    private String location;
    
    @ManyToOne
    @JoinColumn(name="room_id")
    private Rooms room;

    
}
