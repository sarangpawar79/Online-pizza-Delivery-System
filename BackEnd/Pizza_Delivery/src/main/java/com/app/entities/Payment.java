package com.app.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(exclude = "currentOrder")
@Table(name = "payment")
@NoArgsConstructor

public class Payment  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "ammount")
	private double ammount;
	
	@Enumerated(EnumType.STRING)
	
	@Column(name = "payment_status", length=25)
	private PaymentStatus paymentStatus;
	
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	@Column(name="order_dateTime")
	private LocalDateTime orderDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "payment_mode", length=20)
	private PaymentModes payment_mode;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "foodorder_id",nullable = false)
	private FoodOrder currentOrder;
	
	

	@Override
	public String toString() {
		return "Payment [id=" + id + ", ammount=" + ammount + ", paymentStatus=" + paymentStatus + ", orderDate="
				+ orderDate + ", payment_mode=" + payment_mode + ", currentOrder=" + currentOrder + "]";
	}



	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}



//	public Payment(Integer id, double ammount, PaymentStatus paymentStatus, LocalDateTime orderDate,
//			PaymentModes payment_mode, FoodOrder currentOrder) {
//		super();
//		this.id = id;
//		this.ammount = ammount;
//		this.paymentStatus = paymentStatus;
//		this.orderDate = orderDate;
//		this.payment_mode = payment_mode;
//		this.currentOrder = currentOrder;
//	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public double getAmmount() {
		return ammount;
	}



	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}



	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}



	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}



	public LocalDateTime getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}



	public PaymentModes getPayment_mode() {
		return payment_mode;
	}



	public void setPayment_mode(PaymentModes payment_mode) {
		this.payment_mode = payment_mode;
	}



	public FoodOrder getCurrentOrder() {
		return currentOrder;
	}



	public void setCurrentOrder(FoodOrder currentOrder) {
		this.currentOrder = currentOrder;
	}



	public Payment(double ammount, PaymentStatus paymentStatus, LocalDateTime orderDate, PaymentModes payment_mode,
			FoodOrder currentOrder) {
		super();
		this.ammount = ammount;
		this.paymentStatus = paymentStatus;
		this.orderDate = orderDate;
		this.payment_mode = payment_mode;
		this.currentOrder = currentOrder;
	}
	
	
	
}
