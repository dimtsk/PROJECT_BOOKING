/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.booking.model;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long payment_id;
    private String method;
    private Timestamp date;
    private String coupon;
    
}
