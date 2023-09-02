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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "food_order")
@Getter
@Setter
@NoArgsConstructor

@ToString(exclude = { "customer", "deliverboy", "address" })

public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "total_price")
	private double totalPrice;

	@Enumerated(EnumType.STRING)
	@Column(length = 25, name = "status")
	private OrderStatus status;

	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@Column(name = "order_time")
	private LocalDateTime orderTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@Column(name = "delivered_time")
	private LocalDateTime deliveredTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@Column(name = "status_update_date")
	private LocalDateTime statusUpdateDate;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id", nullable = false)
	private User customer;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "deliveryboy_id", nullable = true)
	private User deliverboy;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "address_id", nullable = false)
	private Address address;
	
	

	@Override
	public String toString() {
		return "FoodOrder [id=" + id + ", totalPrice=" + totalPrice + ", status=" + status + ", orderTime=" + orderTime
				+ ", deliveredTime=" + deliveredTime + ", statusUpdateDate=" + statusUpdateDate + ", customer="
				+ customer + ", deliverboy=" + deliverboy + ", address=" + address + "]";
	}



	public FoodOrder() {
		super();
		// TODO Auto-generated constructor stub
	}



	public FoodOrder(Integer id, double totalPrice, OrderStatus status, LocalDateTime orderTime,
			LocalDateTime deliveredTime, LocalDateTime statusUpdateDate, User customer, User deliverboy,
			Address address) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
		this.status = status;
		this.orderTime = orderTime;
		this.deliveredTime = deliveredTime;
		this.statusUpdateDate = statusUpdateDate;
		this.customer = customer;
		this.deliverboy = deliverboy;
		this.address = address;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public double getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}



	public OrderStatus getStatus() {
		return status;
	}



	public void setStatus(OrderStatus status) {
		this.status = status;
	}



	public LocalDateTime getOrderTime() {
		return orderTime;
	}



	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}



	public LocalDateTime getDeliveredTime() {
		return deliveredTime;
	}



	public void setDeliveredTime(LocalDateTime deliveredTime) {
		this.deliveredTime = deliveredTime;
	}



	public LocalDateTime getStatusUpdateDate() {
		return statusUpdateDate;
	}



	public void setStatusUpdateDate(LocalDateTime statusUpdateDate) {
		this.statusUpdateDate = statusUpdateDate;
	}



	public User getCustomer() {
		return customer;
	}



	public void setCustomer(User customer) {
		this.customer = customer;
	}



	public User getDeliverboy() {
		return deliverboy;
	}



	public void setDeliverboy(User deliverboy) {
		this.deliverboy = deliverboy;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public FoodOrder(double totalPrice, OrderStatus status, LocalDateTime orderTime, LocalDateTime deliveredTime,
			User customer, User deliverboy, Address address) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
		this.orderTime = orderTime;
		this.deliveredTime = deliveredTime;
		this.customer = customer;
		this.deliverboy = deliverboy;
		this.address = address;
	}

}
