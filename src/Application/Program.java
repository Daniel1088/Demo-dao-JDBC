package Application;

import java.sql.Date;

import Model.Entities.Department;
import demo.dao.DaoFactory;
import demo.dao.SellerDao;

public class Program {
	
	public static void main(String[] args)
	{
		Department obj = new Department (1, "Books");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(obj);
	}

}
