package Application;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import Model.Entities.Department;
import Model.Entities.Seller;
import demo.dao.DaoFactory;
import demo.dao.SellerDao;


public class Program {
	
	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("\n=== Teste 5:Atualizar vendedores ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Atualização completa");
		
		System.out.println("\n=== Teste 6:Deletar vendedor ===");
		System.out.print("Entre com o Id para deletar:");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("O vendedor foi apagado");
		
		sc.close();
		
	}

}
