/**
 * 
 */
package com.ecomm.dao;

import java.util.List;

import com.ecomm.model.Category;

/**
 * @author DELL
 * CategoryDao interface for category related operations
 */
public interface CategoryDao {

	public boolean add(Category category);
	public boolean delete(Category category);
	public boolean update(Category category);
	public Category retrieve(int categoryId);
	public List<Category> retrieveList(int categoryId);
}
