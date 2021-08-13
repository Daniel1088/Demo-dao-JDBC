package Application;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import Model.Entities.Department;
import Model.Entities.Seller;
import demo.dao.DaoFactory;
import demo.dao.SellerDao;

public class Program {
	
	public static void main(String[] args) throws ParseException
	{
		Department obj = new Department (1, "Books");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Teste 1: Vendedores pelo ID ===");
		
		Seller seller = sellerDao.findById(3);
		
		
		
		System.out.println(seller);
		
		System.out.println("\n=== Teste 2: Vendedores pelo Departamento ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller s: list)
		{
			System.out.println(s);
		}
		
		System.out.println("\n=== Teste 3:Todos os vendedores ===");
		
		
		list = sellerDao.findAll();		
		for (Seller s: list)
		{
			System.out.println(s);
		}
		
		System.out.println("\n=== Teste 4:Inserir vendedores ===");
		Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(0) , 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id ="+ newSeller.getId());
		
	}

}
