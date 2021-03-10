package com.example.demo.brd.domain;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.pay.domain.Payment;
import com.example.demo.prd.domain.Product;
import com.example.demo.rpl.domain.Reply;
import com.example.demo.usr.domain.User;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;



@Entity  @Getter
//@NamedQuery(name = "Board.findByTitle", query = "select b2 from Board b2 where b2.brd_title like :brdTitle")
public class Board {
	@Id @Column(name="brd_no") @GeneratedValue(strategy = GenerationType.IDENTITY) private long brdNo;
	@Column(name="brd_title") private String  brdTitle;
	@Column(name="brd_content") private String brdContent;
	@Column(name="brd_written_date") private String brdWrtDate;
	@Column(name="brd_rank") private String brdRank;
	@Column(name="brd_img") private String brdImg;
	@Column(name="brd_kind") private long brdKind;
	@Column(name="brd_count") @GeneratedValue(strategy = GenerationType.IDENTITY) private long brdCount;
	@Column(name="brd_like") private String brdLike;
	@Column(name="brd_pwd") private String brdPwd;
	@Column(name="usr_nickname") private String usrNikcname;

	@OneToMany(mappedBy="board")
	private List<Reply> replyList = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="usr_no")
	private User user;
	@ManyToOne
	@JoinColumn(name="pay_no")
	private Payment payment;
	@ManyToOne
	@JoinColumn(name="prd_no")
	private Product product;
	
}
