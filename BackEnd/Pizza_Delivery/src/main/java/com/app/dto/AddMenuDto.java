package com.app.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.app.dao.UserRepository;
import com.app.entities.Category;
import com.app.entities.Menu;
import com.app.entities.User;

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
public class AddMenuDto 
{
	private String menuName;
	private double price;
	private String description;
	private MultipartFile imageName;
	private int restaurent;
	private int catagory;
	private Byte status;
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MultipartFile getImageName() {
		return imageName;
	}
	public void setImageName(MultipartFile imageName) {
		this.imageName = imageName;
	}
	public int getRestaurent() {
		return restaurent;
	}
	public void setRestaurent(int restaurent) {
		this.restaurent = restaurent;
	}
	public int getCatagory() {
		return catagory;
	}
	public void setCatagory(int catagory) {
		this.catagory = catagory;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public AddMenuDto(String menuName, double price, String description, MultipartFile imageName, int restaurent,
			int catagory, Byte status) {
		super();
		this.menuName = menuName;
		this.price = price;
		this.description = description;
		this.imageName = imageName;
		this.restaurent = restaurent;
		this.catagory = catagory;
		this.status = status;
	}
	public AddMenuDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddMenuDto [menuName=" + menuName + ", price=" + price + ", description=" + description + ", imageName="
				+ imageName + ", restaurent=" + restaurent + ", catagory=" + catagory + ", status=" + status + "]";
	}
	
	

 public static Menu toEntity(AddMenuDto dto) { Menu entity=new Menu();
  entity.setProductName(dto.menuName ); entity.setDescription(dto.description);
	  entity.setPrice(dto.price); entity.setStatus((byte) 1); return entity; }
 
	
}
