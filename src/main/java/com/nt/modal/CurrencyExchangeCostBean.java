package com.nt.modal;

import lombok.Data;

@Data
public class CurrencyExchangeCostBean {
	private Integer currency_id;
	private String currency_from;
	private String currency_to;
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
