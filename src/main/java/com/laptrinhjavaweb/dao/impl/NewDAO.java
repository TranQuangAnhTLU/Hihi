package com.laptrinhjavaweb.dao.impl;


import java.util.List;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.mapper.NewMapper;

import com.laptrinhjavaweb.model.NewModel;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewMapper(), categoryId);
	}

	@Override
	public void update(String sql, Object... parameters) {
		// TODO Auto-generated method stub

	}



	@Override
	public int count(String sql, Object... parameters) {
		// TODO Auto-generated method stub
		return 0;
	}
//
//	@Override
//	public Long save(NewModel newModel) {
//		ResultSet resultSet = null;
//		Long id = null;
//		
//		Connection connection = null;
//		String sql = "Insert INTO NEWS (title , content , categoryid) value(?,?,?)";
//		
//		PreparedStatement statement = null;
//		try {
//			connection = getConnection();
//			connection.setAutoCommit(false) ;
//			statement = connection.prepareStatement(sql,statement.RETURN_GENERATED_KEYS);
//			statement.setString(1, newModel.getTitle());
//			statement.setString(2, newModel.getContent());
//			statement.setLong(3, newModel.getCategoryId());
//			statement.executeUpdate();
//			resultSet = statement.getGeneratedKeys();
//			if (resultSet.next()) {
//				id = resultSet.getLong(1);
//			}
//			connection.commit();
//			return id;
//
//		} catch (SQLException e) {
//			if (connection != null) {
//				try {
//					connection.rollback();
//				} catch (Exception e1) {
//					e1.printStackTrace();
//				}
//			}
//			e.printStackTrace();
//		} finally {
//			try {
//
//				if (connection != null) {
//					connection.close();
//				}
//				if (statement != null) {
//
//					statement.close();
//				}
//				if (resultSet != null) {
//					resultSet.close();
//				}
//				return null;
//			} catch (Exception e) {
//				return null;
//			}
//		}
//
//		
//	}

	@Override
	public void update(NewModel updataNew) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Long save(NewModel newModel) {
		String sql = "INSERT INTO news (title , content , categoryid) VALUES(? ,? ,?)";
		return insert(sql, newModel.getTitle(),newModel.getContent(),newModel.getCategoryId());
	}

}
