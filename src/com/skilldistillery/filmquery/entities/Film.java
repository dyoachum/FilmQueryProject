package com.skilldistillery.filmquery.entities;

public class Film {
	private int id;
	private String rating;
	private double replacementCost;
	private Integer realseYear;
	private String specialFeatures;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", rating=" + rating + "]";
	}
	
}
