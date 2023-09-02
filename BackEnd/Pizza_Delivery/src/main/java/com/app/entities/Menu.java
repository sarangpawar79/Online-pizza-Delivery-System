package com.app.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "menu")
@Getter
@Setter
@ToString(exclude = {"restaurant","category"})
@NoArgsConstructor
@AllArgsConstructor
public class Menu
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "product_name" ,length =20)
	private String productName;
	
	@Column(length =100,name = "description")
	private String description;
	
	@Column(name = "price")
	double price;
	
	@Column(length =100,name = "image")
	private String image;
	
	@Column(name="status")
	private byte status;
	//@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "User_id",nullable= true)
	private User restaurant;
	//@JsonIgnore

	@ManyToOne//(fetch = FetchType.LAZY)
	@JoinColumn(name = "cat_id",nullable=true)
	private Category category;
	
	 @Lob
	    private byte[] imageData;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public User getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(User restaurant) {
		this.restaurant = restaurant;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Menu(Integer id, String productName, String description, double price, String image, byte status,
			User restaurant, Category category) {
		super();
		this.id = id;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.image = image;
		this.status = status;
		this.restaurant = restaurant;
		this.category = category;
	}

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", productName=" + productName + ", description=" + description + ", price=" + price
				+ ", image=" + image + ", status=" + status + ", restaurant=" + restaurant + ", category=" + category
				+ "]";
	}
	
	
}
