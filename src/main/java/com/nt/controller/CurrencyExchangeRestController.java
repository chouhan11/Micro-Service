package com.nt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.modal.CurrencyExchangeCostBean;
import com.nt.service.CurrencyExchangeService;

@RestController
public class CurrencyExchangeRestController {

	@Autowired
	private CurrencyExchangeService service;

	private static final Logger logger = LoggerFactory.getLogger(CurrencyExchangeRestController.class);

	@RequestMapping(value = "/getcurrency/from/{from}/to/{to}", produces = "application/json")
	public CurrencyExchangeCostBean findCurrencyRate(@PathVariable("from") String from, @PathVariable("to") String to) {
		logger.info("Find currency rate method started");
		CurrencyExchangeCostBean bean = null;
		// use service
		bean = service.findCurrencyCost(from, to);
		System.out.println();
		logger.info("Find currency rate method ended");
		return bean;
	}
}
