package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
//interfaace cha co parameter T
public interface RowMapper<T> {
	T mapRow(ResultSet rs);

}
