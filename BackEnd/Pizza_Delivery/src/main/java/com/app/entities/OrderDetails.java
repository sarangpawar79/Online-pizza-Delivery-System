package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "order_details")
@Getter
@Setter
@ToString(exclude = {"currentOrder","selectedProduct"})
@NoArgsConstructor

public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "total_ammount")
	private double total;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "foodorder_id", nullable = false)
	private FoodOrder currentOrder;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "menu_id", nullable = false)
	private Menu selectedProduct;
	
	

	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", quantity=" + quantity + ", total=" + total + ", currentOrder="
				+ currentOrder + ", selectedProduct=" + selectedProduct + "]";
	}



	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}



	public OrderDetails(Integer id, int quantity, double total, FoodOrder currentOrder, Menu selectedProduct) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.total = total;
		this.currentOrder = currentOrder;
		this.selectedProduct = selectedProduct;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}



	public FoodOrder getCurrentOrder() {
		return currentOrder;
	}



	public void setCurrentOrder(FoodOrder currentOrder) {
		this.currentOrder = currentOrder;
	}



	public Menu getSelectedProduct() {
		return selectedProduct;
	}



	public void setSelectedProduct(Menu selectedProduct) {
		this.selectedProduct = selectedProduct;
	}



	public OrderDetails(int quantity, double total, FoodOrder currentOrder, Menu selectedProduct) {
		super();
		this.quantity = quantity;
		this.total = total;
		this.currentOrder = currentOrder;
		this.selectedProduct = selectedProduct;
	}
	
	

}
