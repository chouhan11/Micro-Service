package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CURRENCY_EXCHANGE_DTLS")
public class CurrencyExchangeEntity {

	@Id
	@Column(name = "currency_id")
	private Integer currency_id;

	@Column(name = "currency_from")
	private String currency_from;

	@Column(name = "currency_to")
	private String currency_to;

	@Column(name = "currency_val")
	private Double currency_val;

	public Integer getCurrency_id() {
		return currency_id;
	}

	public void setCurrency_id(Integer currency_id) {
		this.currency_id = currency_id;
	}

	public String getCurrency_from() {
		return currency_from;
	}

	public void setCurrency_from(String currency_from) {
		this.currency_from = currency_from;
	}

	public String getCurrency_to() {
		return currency_to;
	}

	public void setCurrency_to(String currency_to) {
		this.currency_to = currency_to;
	}

	public Double getCurrency_val() {
		return currency_val;
	}

	public void setCurrency_val(Double currency_val) {
		this.currency_val = currency_val;
	}

	@Override
	public String toString() {
		return "CurrencyExchangeCostBean [currency_id=" + currency_id + ", currency_from=" + currency_from
				+ ", currency_to=" + currency_to + ", currency_val=" + currency_val + "]";

	}
}