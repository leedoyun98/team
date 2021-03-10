package com.example.demo.usr.repository;

import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;
import com.example.demo.brd.domain.Board;
import com.example.demo.usr.domain.QUser;
import com.example.demo.usr.domain.User;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class UserRepositoryImpl extends QuerydslRepositorySupport 
									implements IUserRepository{
	private final JPAQueryFactory qf;
	private final EntityManager em;
	public UserRepositoryImpl(EntityManager em,JPAQueryFactory qf) {
		super(Board.class);
		this.qf = qf;
		this.em = em;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findByTitle(User user) {
	    return em.createQuery("select login_num loginNum, userid, password from login  where userid like :userid and password like :password")
			.setParameter("user", user)
			.getResultList();

	}
	
	public List<User> find(String name){
		QUser user = QUser.user;
		return qf.selectFrom(user).fetch();
	}

}