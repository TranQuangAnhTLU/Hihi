package com.laptrinhjavaweb.servlet;

import java.util.List;

import javax.inject.Inject;


import com.laptrinhjavaweb.dao.impl.CategoryDAO;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.service.impl.ICategoryService;

public class CategoryService implements ICategoryService{

	@Inject
	private CategoryDAO categoryDAO = new CategoryDAO();
	
	@Override
	public List<CategoryModel> findAll() {
		
		return categoryDAO.findAll();
	}

	





}
