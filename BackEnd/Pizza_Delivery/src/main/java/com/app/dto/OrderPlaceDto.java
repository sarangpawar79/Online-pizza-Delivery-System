package com.app.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class OrderPlaceDto {

	private int userId;
	private int addressId;
	private String paymentMode;
	
	

	@Override
	public String toString() {
		return "OrderPlaceDto [userId=" + userId + ", addressId=" + addressId + ", paymentMode=" + paymentMode + "]";
	}



	public OrderPlaceDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public int getAddressId() {
		return addressId;
	}



	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}



	public String getPaymentMode() {
		return paymentMode;
	}



	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}



	public OrderPlaceDto(int userId, int addressId, String paymentMode) {
		super();
		this.userId = userId;
		this.addressId = addressId;
		this.paymentMode = paymentMode;
	}

}
