package com.example.demo.brd.service;


import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.brd.domain.Board;
import com.example.demo.brd.repository.BoardRepository;
import com.example.demo.cmm.service.AbstractService;
import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class BoardServiceImpl extends AbstractService<Board> implements BoardService{
	private final BoardRepository repository;
	
	@Override public long save(Board t) {return (repository.save(t)!=null) ? 1:0;}
	@Override public long count() {return (long)repository.count();}
	@Override public Board getOne(long id) {return repository.getOne(id);}
	@Override public Optional<Board> findById(long id){return repository.findById(id);}
	@Override public boolean existsById(long id) {return repository.existsById(id);}
	@Override public List<Board> findAll() {return repository.findAll();}
	@Override public long delete(Board t) {
		repository.delete(t); 
		return (getOne(t.getBrdNo())==null)? 1:0;
	}
	@Override
	public List<Board> findByTitle(String title) {
		return repository.findByTitle(title);
	}

	
}
