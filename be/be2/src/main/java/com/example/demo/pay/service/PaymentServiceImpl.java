package com.example.demo.pay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.pay.domain.Payment;
import com.example.demo.pay.repository.PaymentRepository;
import com.example.demo.pay.service.PaymentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl extends AbstractService<Payment> 
								implements PaymentService{
	private final PaymentRepository repo;

	@Override public long save(Payment t) {return (repo.save(t)!=null) ? 1 : 0 ;}
	@Override public long count() {return (long) repo.count();}
	@Override public Payment getOne(long id) {return repo.getOne(id);}
	@Override public Optional<Payment> findById(long id) {return repo.findById(id);}
	@Override public boolean existsById(long id) {return repo.existsById(id);}
	@Override public List<Payment> findAll() {return repo.findAll();}
	@Override public long delete(Payment t) {
		repo.delete(t); 
		return (getOne(t.getPayNo())==null) ? 1 : 0;
	}
}
