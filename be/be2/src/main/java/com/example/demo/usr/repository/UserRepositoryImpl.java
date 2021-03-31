package com.example.demo.usr.repository;

import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.usr.domain.QUser;
import com.example.demo.usr.domain.User;
import com.example.demo.usr.domain.UserDto;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class UserRepositoryImpl extends QuerydslRepositorySupport 
									implements IUserRepository{
	private final JPAQueryFactory qf;
	private final EntityManager em;
	public UserRepositoryImpl(EntityManager em,JPAQueryFactory qf) {
		super(User.class);
		this.qf = qf;
		this.em = em;
		
	}



	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findByTitle(User user) {
	    return em.createQuery("select usr_no usrNo,usr_email usrEmail,usr_pwd  from User  where usr_email like :usrEmail and usr_pwd like :usrPwd")
			.setParameter("user", user)
			.getResultList();

	}
	

	@SuppressWarnings("unchecked")
	@Override
	public List<User> login(User user) {
		QUser userDto = QUser.user;
		String checkId= "1";
		String check= "1";
		System.out.println("안날라감");
		return  qf.select(userDto).from(userDto).where(userDto.usrEmail.eq(checkId).and(userDto.usrPwd.eq(check))).fetchOne();
//		return em.createQuery("select c from User c where c.usr_email like :usrEmail and c.usr_pwd like :usrPwd")
//				.setParameter("usrEmail", user)
//				.getResultList();
	}

}
