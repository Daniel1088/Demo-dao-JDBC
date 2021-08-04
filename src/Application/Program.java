package Application;

import java.sql.Date;

import Model.Entities.Department;

public class Program {
	
	public static void main(String[] args)
	{
		Department obj = new Department (1, "Books");
		
		System.out.println(obj);
	}

}
