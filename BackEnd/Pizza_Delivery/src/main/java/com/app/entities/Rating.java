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
@Getter
@Setter
@ToString(exclude = { "selectedCustomer", "selectedRestaurant" })
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rating")
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "rating")
	private int rating;
	@Column(name = "comment")
	private String comment;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "User_id", nullable = false)
	private User selectedRestaurant;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id", nullable = false)
	private User selectedCustomer;
	
	

	@Override
	public String toString() {
		return "Rating [id=" + id + ", rating=" + rating + ", comment=" + comment + ", selectedRestaurant="
				+ selectedRestaurant + ", selectedCustomer=" + selectedCustomer + "]";
	}



	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Rating(Integer id, int rating, String comment, User selectedRestaurant, User selectedCustomer) {
		super();
		this.id = id;
		this.rating = rating;
		this.comment = comment;
		this.selectedRestaurant = selectedRestaurant;
		this.selectedCustomer = selectedCustomer;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public User getSelectedRestaurant() {
		return selectedRestaurant;
	}



	public void setSelectedRestaurant(User selectedRestaurant) {
		this.selectedRestaurant = selectedRestaurant;
	}



	public User getSelectedCustomer() {
		return selectedCustomer;
	}



	public void setSelectedCustomer(User selectedCustomer) {
		this.selectedCustomer = selectedCustomer;
	}



	public Rating(int rating, String comment, User selectedRestaurant, User selectedCustomer) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.selectedRestaurant = selectedRestaurant;
		this.selectedCustomer = selectedCustomer;
	}

}
