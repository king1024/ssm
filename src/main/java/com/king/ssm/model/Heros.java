package com.king.ssm.model;

public class Heros {
	
	private String id;
	private String name;
	private String special;
	private int height;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Heros [id=" + id + ", name=" + name + ", special=" + special + ", height=" + height + "]";
	}
	
}
