package com.example.demo.brd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.brd.domain.Board;
import com.example.demo.brd.domain.BoardDto;
interface IBoardRepository{
	public List<Board> findByTitle(String brdTitle);
//	public List<Board> findByWriteDate(String writeDate);
//	public List<BoardDto> findByUserNo(int usrNo);
	
	
}

public interface BoardRepository extends JpaRepository<Board, Long>,IBoardRepository{


}
