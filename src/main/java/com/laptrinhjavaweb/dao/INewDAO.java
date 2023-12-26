package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.NewModel;

public interface INewDAO {
	List<NewModel> findByCategoryId(Long categoryId);
	Long save(NewModel newModel);
	void update(NewModel updataNew);
	void delete(long id);
	//List<NewModel> findAll(Pageble pageble);
	int getTotalItem();

}
