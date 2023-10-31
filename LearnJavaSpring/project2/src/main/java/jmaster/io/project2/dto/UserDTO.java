package jmaster.io.project2.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class UserDTO {  // DTO sử dụng cho lớp Controller View hoặc để trả về dữ liệu.
						// Vì đôi lúc trong DTO ta chỉ cần show 21 số
						// thông tin của User thôi, không cần đầy đủ 
						// như bên class User(đây là lớp entity dùng để map với table)
						// trong project lớn thì hay tách thành như này.
	
	// Trong này thì mình bỏ những anotation của thằng Entity đi, ko liên quan đến thằng Entity
	// Vì thằng này nó không map với bảng trong csdl.
	// Chỉ dùng thằng này để map với controller view thôi.
	// Nói cách khác, thằng DTO dùng để tương tác với phần frontend
	// Còn thằng Entity thì sẽ ẩn đằng sau. 
	
	private Integer id;

	@NotBlank // thằng này của validation, nếu thằng name bị trống thì nó bắn ra exception
	private String name;

	private String avatar;
	private String username;
	private String password;

	@DateTimeFormat(pattern = "dd/MM/yyyy") 
	private Date birthdate;

	private MultipartFile file;
	private Date createdAt;
	
	private List<UserRoleDTO> userRoles;
	

	public List<UserRoleDTO> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRoleDTO> userRoles) {
		this.userRoles = userRoles;
	}

	public UserDTO() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	
}
