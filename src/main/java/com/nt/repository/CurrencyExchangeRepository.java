package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nt.entity.CurrencyExchangeEntity;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchangeEntity, Integer> {

	@Query(value = "from CurrencyExchangeEntity where currency_from=:from and currency_to=:to")
	public CurrencyExchangeEntity findByFromAndTo(String from, String to);
}
