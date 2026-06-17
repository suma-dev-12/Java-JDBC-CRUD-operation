package Main;

import java.sql.Connection;
import java.util.Scanner;

import DaoLayer.DaoLayer;
import connection.DBConnection;
import model.Person;

public class Main {

	public static void main(String[] args) {
		Connection con = DBConnection.getConnection();
		Scanner sc = new Scanner(System.in);

		System.out.println("======Menu======");
		System.out.println("1.Insert Record");
		System.out.println("2.ReadRecords");
		System.out.println("3.Update Records");
		System.out.println("4.DeleteRecords");
		System.out.println("5.Get by id");

		System.out.println("Choose the option");
		int option = sc.nextInt();
		switch (option) {
		case 1 :
		{
			System.out.println("Enter the id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Name");
			String name = sc.nextLine();
			System.out.println("Enter the  Age");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Role");
			String role = sc.nextLine();
			Person p = new Person();
			p.setBemp_id(id);
			p.setBemp_name(name);
			p.setAge(age);
			p.setRole(role);
			DaoLayer.insertRecord(con, p);
               break;
		}
		case 2: {
			DaoLayer.selectQuery(con);
			break;
		}
		case 3: {
			// Updation
			System.out.println("Enter the id To update");
			int up_id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Role to be Updated");
			String role = sc.nextLine();
			Person p1 = DaoLayer.getPersonById(con, up_id);
			p1.setRole(role);;
			DaoLayer.updateRecord(con, p1);
			break;

		}
		case 5: {
			System.out.println("Enter the id to  get Data:");
			int id = sc.nextInt();
			Person p = DaoLayer.getPersonById(con, id);
			System.out.println("Id:" + p.getBemp_id() + "\nName:" + p.getBemp_name() + "\nAge:" + p.getAge() + "\nRole:"
					+ p.getRole());
			break;

		}
		default:
		{
			System.out.println("Enter the Correct option");
		}
		}

	}
}
