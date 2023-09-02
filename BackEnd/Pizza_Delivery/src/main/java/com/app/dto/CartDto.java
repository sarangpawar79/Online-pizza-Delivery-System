package com.app.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CartDto 
{
	private int menuId;
	private int userId;
	private int quantity;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public CartDto(int menuId, int userId, int quantity) {
		super();
		this.menuId = menuId;
		this.userId = userId;
		this.quantity = quantity;
	}
	public CartDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CartDto [menuId=" + menuId + ", userId=" + userId + ", quantity=" + quantity + "]";
	}
	
	
}
