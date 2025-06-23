package com.example.app.service;

import java.util.List;

import com.example.app.domain.Clothes;

public interface ClothesService {
	
	List<Clothes> getClothesList();
	List<Clothes> getClothesList(Integer categoryId);
	Clothes getClothes(Integer id);
	void editClothesInfo(Clothes clothes);

}
