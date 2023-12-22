package com.laptrinhjavaweb.service.impl;

import java.util.List;

import com.laptrinhjavaweb.model.NewModel;

public interface INewService {
	List<NewModel> findByCategoryId(long categoryId);

}

