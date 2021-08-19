/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.booking.model;

import java.sql.Timestamp;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservation {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long reservation_id;
    private Timestamp start_date;
    private Timestamp end_date;
    private int discount;
    
    @ManyToOne
    @JoinColumn(name="user_id")
    private User users;
    
    @OneToOne
    @JoinColumn(name="payment_id")
    private Payment payment;
    
    @ManyToOne
    @JoinColumn(name="room_id")
    private Rooms rooms;
    
}
