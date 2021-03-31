package com.example.demo.brd.repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.brd.domain.Board;
import com.example.demo.brd.domain.BoardDto;
import com.querydsl.jpa.impl.JPADeleteClause;
import com.querydsl.jpa.impl.JPAUpdateClause;
interface IBoardRepository{
	public Board findByTitle(String brdTitle);
	public Board findByBrd(Board brdNo);
	public List<Board> search(String brdTitle);
	public List<Board> blogListAll();
	public long update(Board brd, BoardDto t);

//	public void count(Object object);
//	public List<Board> findByWriteDate(String writeDate);
//	public List<BoardDto> findByUserNo(int usrNo);

	
}

public interface BoardRepository extends JpaRepository<Board, Long>,IBoardRepository{

	

	
	



	





	

	

	
	

	




	


}
