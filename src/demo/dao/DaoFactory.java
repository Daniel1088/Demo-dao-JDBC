package demo.dao;

import implementacao.model.dao.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao()
	{
		return new SellerDaoJDBC();
	}

}
