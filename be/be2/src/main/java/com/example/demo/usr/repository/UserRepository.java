package com.example.demo.usr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.brd.domain.Board;
import com.example.demo.usr.domain.User;
import com.example.demo.usr.domain.UserDto;

import java.util.Optional;

interface IUserRepository{
	public List<User> findByTitle(User user);
	public List<User> login(User user);
}

public interface UserRepository extends JpaRepository<User, Long>,
									IUserRepository{
	
	@Query("update User set usr_pwd = :usrPwd,"
			+ " usr_phone = :usrPhone"
			+ " where usr_no = :usrNo")
	public int update(@Param("usrPwd") String usrPwd, 
						@Param("usrPhone") String usrPhone, 
						@Param("usrNo") int usrNo);

	
	


}



