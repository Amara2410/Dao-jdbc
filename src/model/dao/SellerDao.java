package model.dao;

import models.entities.Department;
import models.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Department findById(Integer id);

}
