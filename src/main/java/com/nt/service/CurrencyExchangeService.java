package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.CurrencyExchangeEntity;
import com.nt.modal.CurrencyExchangeCostBean;
import com.nt.repository.CurrencyExchangeRepository;

@Service
public class CurrencyExchangeService {

	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepo;

	public CurrencyExchangeCostBean findCurrencyCost(String from, String to) {
		CurrencyExchangeCostBean bean = new CurrencyExchangeCostBean();
		CurrencyExchangeEntity entity = currencyExchangeRepo.findByFromAndTo(from, to);
		BeanUtils.copyProperties(entity, bean);
		return bean;
	}
}
