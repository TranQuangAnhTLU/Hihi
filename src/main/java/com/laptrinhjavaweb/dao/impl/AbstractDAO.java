package com.laptrinhjavaweb.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dao.GennericDAO;
import com.laptrinhjavaweb.mapper.RowMapper;

public class AbstractDAO<T> implements GennericDAO<T> {
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/new_web";
			String user = "root";
			String password = "getchuc";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	
	@Override
	public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
		List<T> result = new ArrayList<>();
		Connection connection = null;
		PreparedStatement statement = null;
		
		ResultSet resultSet = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			setParameter(statement,parameters);
			
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				result.add(rowMapper.mapRow(resultSet));
			}
			return result;
		} catch (SQLException e) {
			return null;
		} finally {
			try {

				if (connection != null) {
					connection.close();
				}
				if (statement != null) {

					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
				return null;
			} catch (Exception e) {
				return null;
			}

		}
		
	}


	private void setParameter(PreparedStatement statement, Object ... parameters) {
	{
				try {
					for (int i = 0 ; i < parameters.length ; i++) {
						Object parameter = parameters[i];
						int index = i +1 ;
						if(parameter instanceof Long) {
							statement.setLong(index, (Long) parameter);
						}
						
					}
				} catch (SQLException e) {
                    e.printStackTrace();
				}
			
			
		}
		
	}

//	private void setParmeter(PreparedStatement statement, Object ... parameters) {
//		
//		
//	}



}
