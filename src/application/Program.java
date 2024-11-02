package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1,"books");
	
		SellerDao sellerDao= DaoFactory.createSellerDao();
				
		Seller seller = new Seller(21,"Marta","bob@gmail.com", new Date(),3000.0,obj);
		
		System.out.println(seller);

	}

}
