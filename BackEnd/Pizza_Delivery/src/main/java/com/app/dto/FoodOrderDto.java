package com.app.dto;

import java.util.List;

import com.app.entities.FoodOrder;
import com.app.entities.OrderDetails;
import com.app.entities.Payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class FoodOrderDto {

	private FoodOrder order;
	private List<OrderDetails> orderDetails;
	private Payment payment;
	
	
	
	@Override
	public String toString() {
		return "FoodOrderDto [order=" + order + ", orderDetails=" + orderDetails + ", payment=" + payment + "]";
	}

	public FoodOrder getOrder() {
		return order;
	}

	public void setOrder(FoodOrder order) {
		this.order = order;
	}

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public FoodOrderDto(FoodOrder order, Payment payment) {
		super();
		this.order = order;
		this.payment = payment;
	}

	public FoodOrderDto(FoodOrder order, List<OrderDetails> orderDetails, Payment payment) {
		super();
		this.order = order;
		this.orderDetails = orderDetails;
		this.payment = payment;
	}
	
	
}
