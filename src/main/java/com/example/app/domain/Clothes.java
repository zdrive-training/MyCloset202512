package com.example.app.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Clothes {
	
	private Integer id;
	private String name;
	private String color;
	private Brand brand;
	private Size size;
	private Category category;
	private LocalDate purchasedAt;

}
