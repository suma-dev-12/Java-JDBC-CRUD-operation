package model;

public class Person {
	private int bemp_id;
	private String bemp_name;
	private int age;
	private String role;
	
	public Person() {

	}
	public Person(int bemp_id, String bemp_name, int age, String role) {
		
		this.bemp_id = bemp_id;
		this.bemp_name = bemp_name;
		this.age = age;
		this.role = role;
	}
	public int getBemp_id() {
		return bemp_id;
	}
	public void setBemp_id(int bemp_id) {
		this.bemp_id = bemp_id;
	}
	public String getBemp_name() {
		return bemp_name;
	}
	public void setBemp_name(String bemp_name) {
		this.bemp_name = bemp_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
