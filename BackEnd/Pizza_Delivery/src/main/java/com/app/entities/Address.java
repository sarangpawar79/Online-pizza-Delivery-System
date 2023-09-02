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
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "selectedUser")
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "add_line_1" ,length =50)
	private String line1;
	@Column(name = "add_line_2",length =50)
	private String line2;
	@Column(name = "contact_no",length =15)
	private String contactNo;
	@Column(name = "pincode")
	private int pincode;
	@Column(length =20,name = "city")
	private String city;
	@Column(length =20,name = "state")
	private String state;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id",nullable = false)
	private User selectedUser;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public User getSelectedUser() {
		return selectedUser;
	}
	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
	}
	public Address(Integer id, String line1, String line2, String contactNo, int pincode, String city, String state,
			User selectedUser) {
		super();
		this.id = id;
		this.line1 = line1;
		this.line2 = line2;
		this.contactNo = contactNo;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.selectedUser = selectedUser;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", line1=" + line1 + ", line2=" + line2 + ", contactNo=" + contactNo + ", pincode="
				+ pincode + ", city=" + city + ", state=" + state + ", selectedUser=" + selectedUser + "]";
	}
	
	
	
	
}