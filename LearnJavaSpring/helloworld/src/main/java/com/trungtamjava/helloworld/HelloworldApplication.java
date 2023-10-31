package com.trungtamjava.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.trungtamjava.helloworld.entity.Laptop;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	// spring container
	// bean: object: IoC
	//	Trong Spring Boot, Bean là một đối tượng được quản lý bởi Spring IoC container. Bean đại diện cho một thành phần của ứng dụng, ví dụ như một đối tượng Service, DAO, Controller, Repository, Configuration, v.v.
	//	Khi ứng dụng được khởi chạy, Spring IoC container sẽ tạo và quản lý các bean.
	// DI(Dependency Inject): dùng lại bean

	// thường thì @Bean dùng cho mấy thằng không hay thay đổi dữ liệu 
	// ví dụ như một đối tượng Service, DAO, Controller, Repository, Configuration, v.v.
	
	@Bean(name = "laptop1") // đăt name để phân biệt 1 thằng laptop vs nhau
	public Laptop laptop1() {
		Laptop laptop = new Laptop(1, "A");

		return laptop;

	}
	
	@Bean(name = "laptop2")
	public Laptop laptop2() {
		Laptop laptop2 = new Laptop(2, "B");
		return laptop2;
	}
}

