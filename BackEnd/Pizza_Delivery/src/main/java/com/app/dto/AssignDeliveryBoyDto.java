package com.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssignDeliveryBoyDto {

	private int orderId;
	private int userId;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public AssignDeliveryBoyDto(int orderId, int userId) {
		super();
		this.orderId = orderId;
		this.userId = userId;
	}
	public AssignDeliveryBoyDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AssignDeliveryBoyDto [orderId=" + orderId + ", userId=" + userId + "]";
	}
	
	

	/*
	 * public AssignDeliveryBoyDto(int orderId, int userId) { super(); this.orderId
	 * = orderId; this.userId = userId; }
	 */

}
