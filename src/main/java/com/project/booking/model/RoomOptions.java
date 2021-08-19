/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="room_option")
public class RoomOptions {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long option_id;
    private boolean options;//******
    
}
