package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RatingDto {

	private int rating;
	private String comment;
	private int restId;
	private int userId;
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
	public int getRestId() {
		return restId;
	}
	public void setRestId(int restId) {
		this.restId = restId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public RatingDto(int rating, String comment, int restId, int userId) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.restId = restId;
		this.userId = userId;
	}
	public RatingDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RatingDto [rating=" + rating + ", comment=" + comment + ", restId=" + restId + ", userId=" + userId
				+ "]";
	}
	
	
	
	
	
}
