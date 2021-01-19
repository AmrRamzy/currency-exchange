package com.amr.currencyexchange.restcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amr.currencyexchange.dto.ExchangeObject;
import com.amr.currencyexchange.repo.ExchangeObjectRepo;


@RestController
public class CurrencyExchangeRestController {
	
	@Value(value = "${server.port}")
	private Integer port;
	
	
	private ExchangeObjectRepo exchangeObjectRepo;
	
	@Autowired
	public CurrencyExchangeRestController(ExchangeObjectRepo exchangeObjectRepo) {
		super();
		this.exchangeObjectRepo = exchangeObjectRepo;
	}



	@GetMapping("currency-conversion/from/{from}/to/{to}")
	public @ResponseBody ResponseEntity<ExchangeObject> currencyConversion(@PathVariable String from ,@PathVariable String to) {

		ResponseEntity<ExchangeObject> response = ResponseEntity.badRequest().build();
		Optional<ExchangeObject> exchangeObject = exchangeObjectRepo.findByFromAndTo(from, to);
		if(exchangeObject.isPresent()) {
			exchangeObject.get().setPort(port);
			response = ResponseEntity.ok(exchangeObject.get());
		}
		
		
		return response;
	}

}
