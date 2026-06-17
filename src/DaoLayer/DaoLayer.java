package DaoLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Person;

public class DaoLayer {

	public static void insertRecord(Connection con,Person p) {
		try {
			String query = "insert into bemp(bemp_id,bemp_name,age,role) values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1,p.getBemp_id());
			pstmt.setString(2, p.getBemp_name());
			pstmt.setInt(3, p.getAge());
			pstmt.setString(4, p.getRole());
			pstmt.execute();
			System.out.println("Query Inserted SucessFully!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Query not Executed");
		}
	}
		
		public static void selectQuery(Connection con) {
			try {
				String query = "select * from  bemp";
				Statement stmt = con.createStatement();
				ResultSet res = stmt.executeQuery(query);

				System.out.println("Besant employee");
				while (res.next() == true) {
					System.out.println("Id:" + res.getInt(1) + "\nname:" + res.getString(2) + "\nAge:" + res.getInt(3)
							+ "\nRole:" + res.getString(4));
				}
				System.out.println("Query executed SucessFully");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
			public static void updateRecord(Connection con,Person p) {
				try {
					String query="update bemp set role=? where bemp_id=?";
					PreparedStatement pstmt=con.prepareStatement(query);
					pstmt.setString(1,p.getRole());
					pstmt.setInt(2, p.getBemp_id());
					pstmt.executeUpdate();
					System.out.println("Query updated Sucessfully");
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Query not Excuted !");
				}
				}
			
		public static void deleteRecord(Connection con,Person p) {
	             try {
	            	   String query="delete from bemp where bemp_id=?";
	            	   PreparedStatement pstmt=con.prepareStatement(query);
	            	   pstmt.setInt(1, p.getBemp_id());
	            	   pstmt.execute();
	            	   System.out.println("Record Deleted  SucessFully");
	            	 
	             }catch (Exception e) {
					System.out.println("Query Not Executed");
				}
		}
		
		public static Person getPersonById(Connection con,int id) {
			PreparedStatement pstmt=null;
			Person p=null;
			try {
			   String query="Select * from bemp where bemp_id=?";
			    pstmt=con.prepareStatement(query);
			    pstmt.setInt(1, id);
			    ResultSet res=pstmt.executeQuery();
			    res.next();
			    p=new Person(res.getInt(1),res.getString(2),res.getInt(3),res.getString(4));
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Query not Excuted");
			}
			return p;
		}

	}

	
	
	
	
