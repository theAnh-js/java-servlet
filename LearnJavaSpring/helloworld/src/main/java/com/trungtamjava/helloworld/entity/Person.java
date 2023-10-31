package com.trungtamjava.helloworld.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity     
@Table(name="person") // tên bảng trong database,
// nếu ko khai báo @Table thì nó sẽ tự lấy tên class Person làm 
// tên bảng.
public class Person {

	@Id //Chú thích @Id được sử dụng để xác định thuộc tính id là khóa chính của bảng
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Spring Boot sẽ tự động sinh ra giá trị cho trường khóa chính
	//Khi lưu trữ một entity mới vào cơ sở dữ liệu, Hibernate sẽ sử dụng identity column để sinh ra giá trị cho khóa chính
	private int id;
	private String name;
	private int age;
	private String homeAddress;  // trong database sẽ là home_addhome

	// nếu sd thư viện lombok thì ko cần render ra 
	// các hàm set, get, tạo contructor
	// mà chỉ cần
	// @Data   -> set,get
	// @NoArgsConstructor  -> default constructor
	// @AllArgsConstructor -> constructor with paramester
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	 
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Person(int id, String name, int age, String homeAddress) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.homeAddress = homeAddress;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

}
