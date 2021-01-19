package com.amr.currencyexchange.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amr.currencyexchange.dto.ExchangeObject;

//@Repository
public interface ExchangeObjectRepo extends JpaRepository<ExchangeObject, Integer>{
	
	public Optional<ExchangeObject> findByFromAndTo(String from,String to);

}
