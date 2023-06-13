/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.model;

import java.time.LocalDate;

/**
 *
 * @author ksouraj
 */
public class Payment {
  private  int  id;
//  private Order order;
//  private User user;
  private LocalDate date;
  private Double vat;
  private Double serviceCharge;
  private Double discount;
  private Double total;

    public Payment() {
    }

    public Payment(int id, LocalDate date, Double vat, Double serviceCharge, Double discount, Double total) {
        this.id = id;
        this.date = date;
        this.vat = vat;
        this.serviceCharge = serviceCharge;
        this.discount = discount;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public Double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Payment{" + "id=" + id + ", date=" + date + ", vat=" + vat + ", serviceCharge=" + serviceCharge + ", discount=" + discount + ", total=" + total + '}';
    }
  
  
          
         
         
}
