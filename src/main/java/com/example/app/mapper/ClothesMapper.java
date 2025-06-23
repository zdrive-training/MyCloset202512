package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.Clothes;

@Mapper
public interface ClothesMapper {
	
	List<Clothes> selectAll();
	Clothes selectById(Integer id);
	List<Clothes> selectByCategory(Integer categoryId);
	void insert(Clothes clothes);
	void update(Clothes clothes);
	void deleteById(Integer id);

}
