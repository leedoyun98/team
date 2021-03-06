package com.example.demo.usr.domain;


import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Lazy;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;

@Component @Getter @Lazy
public class UserDto{
	private static final long serialVersionUID = 1L;

	private long usrNo;

	private String usrName;

	private String usrEmail;

	private String usrPwd;

	private String usrAges;

	private String usrCity;

	private String usrGender;

	private String usrPhone;

	private String usrAddr;
	
	private String usrNickname;
	
	private String password;
	private String username;
//	private Collection<? extends GrantedAuthority> authorities;
//	
//	public UserDto(long usrNo,String usrName, String usrEmail, String usrPwd, String usrPhone, String usrNickname,
//			Collection<? extends GrantedAuthority> authorities) {
//		this.usrNo = usrNo;
//		this.usrName = usrName;
//		this.usrEmail = usrEmail;
//		this.usrPwd = usrPwd;
//		this.usrPhone = usrPhone;
//		this.usrNickname = usrNickname;
//		this.authorities = authorities;
//	}

	
//	public static UserDto create(User user) {
//		List<GrantedAuthority> authorities = 
//				user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getRoleName().name()))
//				.collect(Collectors.toList());
//		return new UserDto(user.getUsrNo(),user.getUsrEmail(), user.getUsrName(), user.getUsrPwd(), user.getUsrPhone(),user.getUsrNickname(), authorities);
//	}
//	
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDto that = (UserDto) o;
		return Objects.equals(usrNo, that.usrNo);
	}
	@Override
	public int hashCode() {
		return Objects.hash(usrNo);
	}
	
	

	


	
	
}