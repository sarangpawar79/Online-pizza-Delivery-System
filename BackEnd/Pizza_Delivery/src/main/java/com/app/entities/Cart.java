package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cart")
@Getter
@Setter
@ToString(exclude = {"selectedMenu","currentUser"})
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "quantity")
	private int quantity;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "menu_id",nullable = false)
	private Menu selectedMenu;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id",nullable = false)
	private User currentUser;
	
	
	
	@Override
	public String toString() {
		return "Cart [id=" + id + ", quantity=" + quantity + ", selectedMenu=" + selectedMenu + ", currentUser="
				+ currentUser + "]";
	}



	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Cart(Integer id, int quantity, Menu selectedMenu, User currentUser) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.selectedMenu = selectedMenu;
		this.currentUser = currentUser;
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



	public Menu getSelectedMenu() {
		return selectedMenu;
	}



	public void setSelectedMenu(Menu selectedMenu) {
		this.selectedMenu = selectedMenu;
	}



	public User getCurrentUser() {
		return currentUser;
	}



	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}



	public Cart(int quantity, Menu selectedMenu, User currentUser) {
		super();
		this.quantity = quantity;
		this.selectedMenu = selectedMenu;
		this.currentUser = currentUser;
	}
}
