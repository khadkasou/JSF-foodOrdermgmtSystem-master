/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.model;

/**
 *
 * @author ksouraj
 */
public enum OrderStatus { 
    PENDING,
    PROCESSING,
    READY_FOR_PICKUP,
    OUT_FOR_DELIVER,
    DELIVERED,
    CANCELLED,
    ON_HOLD,
    COMPLETED
}
