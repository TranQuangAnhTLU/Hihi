package com.laptrinhjavaweb.servlet;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.dao.impl.CategoryDAO;
import com.laptrinhjavaweb.dao.impl.NewDAO;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.service.impl.INewService;

public class NewService implements INewService{

	private INewDAO newDAO;
	public NewService() {
		newDAO = new NewDAO();
		
	}
	public List<NewModel> findByCategoryId(long categoryId) {
		return newDAO.findByCategoryId(categoryId);
	}

}
