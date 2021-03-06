package com.example.demo.pay.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.example.demo.brd.domain.Board;
import com.example.demo.cart.domain.Cart;
import com.example.demo.prd.domain.Product;
import com.example.demo.rcv.domain.Receiver;
import com.example.demo.usr.domain.User;

import lombok.Getter;

@Entity @Getter
public class Payment {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="pay_no") private long payNo;
	   @Column(name="pay_price") private String payPrice;
	   @Column(name="pay_amount") private long payAmount;
	   @Column(name="dvr_fee") private String dvrFee;
	   @Column(name="pay_date") private String payDate;
	   @Column(name="pay_state") private String payState;
   @ManyToOne(fetch=FetchType.LAZY)
   @JoinColumn(name="usr_no")
   private User user;
   
   @ManyToOne(fetch=FetchType.LAZY)
   @JoinColumn(name="prd_no")
   private Product product;
   
   @OneToMany(mappedBy="payment")
   private List<Receiver> receiverList = new ArrayList<>();
   
   @OneToMany(mappedBy="payment")
   private List<Board> boardList = new ArrayList<>();
   
   @OneToOne(mappedBy="payment")
   private Cart cart;
   
}