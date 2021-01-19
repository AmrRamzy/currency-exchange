package com.amr.currencyexchange.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "exchange")
public class ExchangeObject {
	
	public ExchangeObject() {
		super();
	}
	
	public ExchangeObject(Integer id, String from, String to, Double conversionRate) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionRate = conversionRate;
	}


	@Id
	private Integer id;
	
	@Column(name = "from_currency")
	private String from;
	
	@Column(name = "to_currency")
	private String to;
	
	@Column(name = "conversion_rate")
	private Double conversionRate;
	
	@Transient
	private Integer port;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Double getConversionRate() {
		return conversionRate;
	}
	public void setConversionRate(Double conversionRate) {
		this.conversionRate = conversionRate;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExchangeObject other = (ExchangeObject) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ExchangeObject [id=" + id + ", from=" + from + ", to=" + to + ", conversionRate=" + conversionRate
				+ ", port=" + port + "]";
	}
	
}
