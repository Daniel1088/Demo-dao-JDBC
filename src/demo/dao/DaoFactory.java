package demo.dao;

import db.DB;
import implementacao.model.dao.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao()
	{
		return new SellerDaoJDBC(DB.getConnetion());
	}

}
