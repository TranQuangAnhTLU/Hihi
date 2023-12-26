package com.laptrinhjavaweb.service.impl;

import java.util.List;

import com.laptrinhjavaweb.model.NewModel;

public interface INewService {
	List<NewModel> findByCategoryId(long categoryId);
	NewModel save(NewModel newModel);
	NewModel update(NewModel updateNew);
	void delete(long[] ids);
	//List<NewModel> findAll(Pageble pageble);
	int getTotalItem();
	NewModel findOne(long id);
}

