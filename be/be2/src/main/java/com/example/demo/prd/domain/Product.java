package com.example.demo.prd.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.ctg.domain.Category;
import com.example.demo.pay.domain.Payment;

import lombok.Getter;



@Entity @Getter
public class Product {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="prd_no") private long prdNo;
   @Column(name="prd_name") private String prdName;
   @Column(name="prd_img") private String prdImg;
   @Column(name="prd_price") private String prdPrice;
   @Column(name="prd_inv") private String prdInv;

   @ManyToOne
   @JoinColumn(name="ctg_no")
   private Category category;
   
   @OneToMany(mappedBy = "product")
   private List<Payment> paymentList = new ArrayList<>();
}