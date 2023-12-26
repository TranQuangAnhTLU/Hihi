package com.laptrinhjavaweb.servlet;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.INewDAO;

import com.laptrinhjavaweb.dao.impl.NewDAO;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.service.impl.INewService;

public class NewService implements INewService{
    @Inject
	private INewDAO newDAO;

	public List<NewModel> findByCategoryId(long categoryId) {
		return newDAO.findByCategoryId(categoryId);
	}
	@Override
	public NewModel save(NewModel newModel) {
	 Long newId = newDAO.save(newModel);
	 System.out.print(newId);
	 return null;
	}
	@Override
	public NewModel update(NewModel updateNew) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public NewModel findOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
